package Classes;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.*;

public class ExemploStreams {
	
	
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem Aleatória\t--");
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1, new Contato("Simba", 5555));
			put(2, new Contato("Cami", 2222));
			put(3, new Contato("Jon", 4444));
			
		}};
		System.out.println(agenda);
		for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		System.out.println("--\tOrdem Inserção\t--");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
			put(1, new Contato("Simba", 5555));
			put(2, new Contato("Cami", 2222));
			put(3, new Contato("Jon", 4444));
		}};
		
		for (Map.Entry<Integer, Contato> entry : agenda1.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		
		
		
		System.out.println("--\tOrdem Alfabética Autores\t--");
		
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		System.out.println(agenda2);
		for (Map.Entry<Integer, Contato> entry : agenda2.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
			
		
		
		List<String> numerosAleatorios = 
				Arrays.asList("1", "3", "5", "2", "7", "4", "8", "12");
		
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		
		numerosAleatorios.stream().forEach(s -> System.out.println(s));
		
		System.out.println("Pegue os 3 primeiros números e coloquei dentro de um Set: ");
		
		numerosAleatorios.stream().limit(3).collect(Collectors.toSet())
		.forEach(System.out::println);
		
		
		System.out.println("Transforme essa lista de string em números inteiros");
		List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
				.map(Integer::parseInt).collect(Collectors.toList());
		numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Pegue os números pares e maior que 2 e coloque em uma lista: ");
		List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
		.map(Integer::parseInt).filter(i -> i %2 == 0 && i > 2).collect(Collectors.toList());
		System.out.println(listParesMaioresQue2);
		
		
		
		System.out.println("Mostre a média dos números");
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average()
		.ifPresent(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
