package exercicios_do_while;

import java.util.Scanner;

public class Maior_Media {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double numero = 0, maior = Integer.MIN_VALUE, total = 0, media = 0;
		int count = 0;
		
		do {
			System.out.println("Digite o numero " + (count+1) + ": ");
			numero = scan.nextDouble();
			
			total += numero;
			
			if (numero > maior) {
				maior = numero;
			}
			
			count++;
			
		}while(count < 5);
		
		media = total / count;
		
		System.out.println("Media = " + media);
		System.out.println("Maior = " + maior);
		
	}

}
