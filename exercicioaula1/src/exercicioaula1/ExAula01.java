package exercicioaula1;

import java.util.Scanner;

public class ExAula01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = 0;
		
		System.out.println("Informe um número para verificar se é divisível por 10, 5 ou por 2.");
		double numero1 = scanner.nextDouble();
		
		
		/*if ( numero1 % 10 == 0 || numero1 % 5 == 0  || numero1 % 2 == 0) {
			System.out.println( "É divisível.");
		}else { 
			System.out.println("Não é divisível.");
		}*/
		if ( numero1 % 10 == 0)	{
			System.out.println("É divisível por 10.");
		}
		if ( numero1 % 5 == 0) { 
			System.out.println("É divisível por 5.");
		}
		if ( numero1 % 2 == 0) { 
			System.out.println("É divisivel por 2");
		}else  {
			System.out.println("Não é divisível por nenhum deles.");
		}
			
	}

}
