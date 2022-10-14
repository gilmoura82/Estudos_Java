package Classes;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploMap {
	
	public static void main(String[] args) {
		
		Map<String, Double> carrosPopulares = new HashMap<>() {{
		put("gol", 14.4);
		put("uno", 15.6);
		put("mobi", 16.1);
		put("hb20", 14.5);
		put("kwid", 15.6);
		
		}};
		
		System.out.println(carrosPopulares.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo tucson está no dicionário: " + 
		carrosPopulares.containsKey("tucson"));
		
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
			
		System.out.println("Exiba os consumos dos carros: ");
		
		Collection<Double> consumos = carrosPopulares.values(); 
		System.out.println(consumos);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		
		Double modeloMaisEficiente = Collections.max(carrosPopulares.values());
		carrosPopulares.entrySet();
		String modeloEficiente = "";
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: ");
		
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		
		
		// Ornenação
		
		System.out.println("--\tOrdem Aleatória\t--");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 400));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 320));
			put("Harari, Yuval Noah", new Livro("21 Lições Para O Século 21", 285));
		}};
		
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		System.out.println("--\tOrdem Inserção\t--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma Breve História", 400));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 320));
			put("Harari, Yuval Noah", new Livro("21 Lições Para O Século 21", 285));
		}};
		
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		
		System.out.println("--\tOrdem Alfabética Autores\t--");
		
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1) {{
			put("Hawking, Stephen", new Livro("Uma Breve História", 400));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 320));
			put("Harari, Yuval Noah", new Livro("21 Lições Para O Século 21", 285));
		}};
		
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
			
		
		
		System.out.println("--\tOrdem Alfabética dos Livros\t--");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());		
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meusLivros3)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		System.out.println("--\tOrdem dos Livros Por Nº de Páginas\t");	
		Map<String, Livro> meusLivros4 = new TreeMap<>(meusLivros1) {{
			put("Hawking, Stephen", new Livro("Uma Breve História", 400));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 320));
			put("Harari, Yuval Noah", new Livro("21 Lições Para O Século 21", 285));
		}};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
		
		
		
		
		
		
		
		
		
	}
	
	
		

}
