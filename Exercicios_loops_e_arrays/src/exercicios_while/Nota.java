package exercicios_while;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota = -1;
		
		while(!(nota >= 0 && nota <= 10)) {
			System.out.println("Qual a nota do aluno? ");
			nota = scan.nextDouble();
			
			if (!(nota >= 0 && nota <= 10)) {
				System.out.println("Nota invalida!");
			}
		}
		
		
	}

}
