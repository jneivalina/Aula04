import java.util.Scanner;

public class EntendendoLoopWhile2modificado {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
Scanner leitor = new Scanner(System.in);
		
		
		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		int totalAlunos;
		
		System.out.println("Informe o Total de alunos");
		totalAlunos = leitor.nextInt();
		
		while(quantidadeAlunos < totalAlunos) {
		
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "� aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos + 1;
		
		}
		
		media = media/(double) totalAlunos;
				
				System.out.println("A m�dia das idades � :"+ media);
	}

}
