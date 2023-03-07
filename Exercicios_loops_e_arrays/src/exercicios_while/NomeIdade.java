package exercicios_while;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		int idade, count = 0; 
		
		while(!nome.equals("0")){
			
			System.out.println("Qual o nome do aluno: " + count);
			nome = scan.next();
			
			System.out.println("Qual a idade do aluno: " + count);
			idade =  scan.nextInt();
			
			count++;
		}
			

	}

}
