package Classes;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso em KG: ");
		int peso = sc.nextInt();
		
		System.out.println("Digite o altura em metros: ");
		float altura = sc.nextFloat();		
		
		float imc = peso / (altura * altura);
		
		System.out.println("O IMC é: " + imc);
		
		String classificacao = "";
		
		
		
		if (imc < 18.5) classificacao = "Magreza";	
		 else if (imc < 24.9) classificacao = "Normal";
		 else if (imc < 29.9) classificacao = "Sobrepeso";
		 else if (imc < 39.9) classificacao = "Obesidade I";
		 else classificacao = "Obesidade Grave";
		
		System.out.println("A classificação é: " + classificacao + ", pesando " + peso + " kilos" + " e altura de: " + altura);
		
		
		
		
	}

}
