package aulajava;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String msg = "A média é :";
		double media = 0;
		
		System.out.println("Informe a nota 1");
		double nota1 = s.nextDouble();
		
		System.out.println("Informe a nota 2");
		double nota2 = s.nextDouble();
		
		System.out.println("Informe a nota 3");
		double nota3 =s.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		System.out.println(msg + media);
		
		if (media >= 7) {
			System.out.println("APROVADO");
		}else
			if (media < 7 ) {
				System.out.println("EM EXAME");
			}
	}

}
