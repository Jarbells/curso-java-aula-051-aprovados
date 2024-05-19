import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n;
		String[] names;
		double[] scoreA, scoreB;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		names = new String[n];
		scoreA = new double[n];
		scoreB = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
			sc.nextLine();
			names[i] = sc.nextLine();
			scoreA[i] = sc.nextDouble();
			scoreB[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < n; i++) {
			double average = (scoreA[i] + scoreB[i]) / 2.0;
			if(average >= 6.0) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}
}
