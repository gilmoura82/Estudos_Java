package Classes;

import java.util.Scanner;

public class Calculadora {
				
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		System.out.println("Digite o 1º número");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o 2º número");
		numero2 = sc.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("O resultado da soma é = " + resultado);
		
		sc.close();
	}
		
		
}
