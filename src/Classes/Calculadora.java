package Classes;

import java.util.Scanner;

public class Calculadora {
				
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		System.out.println("Digite o 1� n�mero");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero");
		numero2 = sc.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("O resultado da soma � = " + resultado);
		
		sc.close();
	}
		
		
}
