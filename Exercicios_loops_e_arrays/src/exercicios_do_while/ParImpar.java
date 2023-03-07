package exercicios_do_while;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero = 0;
		int countPares = 0, countImpares = 0;
		String opcao = "";
		
		do {
			
			System.out.println("Digite um numero: ");
			numero = scan.nextDouble();
			
			System.out.println("Digite X pra sair e qualquer outra tecla pra continuar ");
			opcao = scan.next();
			
			if (numero % 2 == 0) {
				countPares++;
			}
			else {
				countImpares++;
			}
				
			
		}while(!opcao.equalsIgnoreCase("x"));
		
		System.out.println("Numero de pares: " + countPares);
		System.out.println("Numero de impares: "  + countImpares);
		
	}

}
