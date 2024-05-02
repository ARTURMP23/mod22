package mod22;
import java.util.ArrayList;
import java.util.List;




public class ListaPessoaMulheres {
	 public static void main(String[] args) {
	        
	        List<String[]> pessoas = new ArrayList<>();
	        pessoas.add(new String[]{"João", "Masculino"});
	        pessoas.add(new String[]{"Maria", "Feminino"});
	        pessoas.add(new String[]{"Pedro", "Masculino"});
	        pessoas.add(new String[]{"Ana", "Feminino"});
	        pessoas.add(new String[]{"Luana", "Feminino"});
	        pessoas.add(new String[]{"Mariana", "Feminino"});

	        
	        System.out.println("Lista de pessoas:");
	        pessoas.forEach(pessoa -> System.out.println(pessoa[0] + " - " + pessoa[1]));

	        
	        List<String> mulheres = new ArrayList<>();
	        pessoas.forEach(pessoa -> {
	            if (pessoa[1].equals("Feminino")) {
	                mulheres.add(pessoa[0]);
	            }
	        });

	        System.out.println("******************************************************************");
	        
	        System.out.println("Mulheres na lista:");
	        mulheres.forEach(System.out::println);
	        
	  
	        
	     
	    }
	 
	
		
	}

