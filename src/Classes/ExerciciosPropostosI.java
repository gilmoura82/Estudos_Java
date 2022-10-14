package Classes;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExerciciosPropostosI {
	public static void main(String[] args) {
		
		
		/*
		Dada a popula��o estimada de alguns estados do nordeste brasileiro, fa�a:
		 Estado = PE - popula��o = 9.616.621
		 Estado = AL - popula��o = 3.351.543
		 Estado = CE - popula��o  = 9.187.103
		 Estado = RN - popula��o = 3.534.265
		 */
		
		Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		System.out.println(populacaoEstadosNE);
		
		System.out.println("Substitua a popula��o do estado RN por : 3.534.165");
		populacaoEstadosNE.put("RN", 3534165);
		System.out.println(populacaoEstadosNE);
		
		System.out.println("Confira se o estado da Para�ba (PB) tucson est� no dicion�rio, caso n�o, adicione " + 
                "PB - 4.039.277: ");
		populacaoEstadosNE.put("PB", 4039277);
		System.out.println(populacaoEstadosNE);
		
		System.out.println("Exiba a popula��o de PE: " + populacaoEstadosNE.get("PE"));
		
		System.out.println("Exiba todos os estados e suas popula��os na ordem em que foram informados: ");
		Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<String, Integer>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			put("PB", 4039277);
		}};
		System.out.println(populacaoEstadosNE2);
		
		System.out.println("Exiba todos os estados e suas popula��es na ordem alfab�tica: ");
		Map<String, Integer> meusEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
		System.out.println(meusEstadosNE3);
		
		
		Collection<Integer> populacao = populacaoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor popula��o (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior popula��o (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));
		
        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da popula��o desses estados: " + soma);
		
        System.out.println("Exiba a m�dia da popula��o deste dicion�rio de estados: " + (soma / populacaoEstadosNE.size()));
        System.out.println("Remova os estados com a popula��o menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("Apague o dicionario de estados com suas respectivas popula��es estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se a lista est� vazia: " + populacaoEstadosNE.isEmpty());
		
		
		
		
		
	}
}
