package Classes;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			
		int valorUsuario;
		int multiplicador = 0;
		int total = 0;
		int quantidadeMult;

		System.out.println("================= TABUADA ================");
		System.out.println("Seja muito bem vindo");		
	    System.out.println("Vamos come�ar? Informe o n� da tabuada: ");
	    
	    valorUsuario = ler.nextInt();
	    System.out.println("Informe a quantidade que deve ser multiplicada: ");
	    quantidadeMult = ler.nextInt();
	    if (valorUsuario > 0 && valorUsuario < 10) {
	    	if (valorUsuario % 2 == 0) {
	    		System.out.println(" ================= OBSERVA��O ==================");
	    		System.out.println("OBS: o n� informado � par");
	    	} else {
	    		System.out.println(" ================= OBSERVA��O ==================");
	    		System.out.println("OBS: o n� informado � �mpar");
	    	}
	    	System.out.println(" ================== RESULTADO ==================");
	    	System.out.println("N� informado para TABUADA: " + valorUsuario);
	    	System.out.println("Quantidade multiplicada: " + quantidadeMult);
	    	for (int x = 0; x < quantidadeMult; x++) {
                total = valorUsuario * ++multiplicador;
                System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
            }
	    	System.out.println(" ================== AT� A PR�XIMA ==================");
	    	
	    	
	    }

	    
	}
}
