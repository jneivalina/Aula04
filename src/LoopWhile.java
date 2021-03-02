import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		
		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		
		while(quantidadeAlunos < 5) {
		
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "º aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos + 1;
		
		}
		
		media = media/5.0;
				
				System.out.println("A média das idades é :"+ media);
				
				
		
		
		

	}

}
