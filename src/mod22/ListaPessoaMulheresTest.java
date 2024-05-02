package mod22;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;

public class ListaPessoaMulheresTest {

    @Test
    public void testMulheresNaLista() {
        List<String[]> pessoas = new ArrayList<>();
        pessoas.add(new String[]{"João", "Masculino"});
        pessoas.add(new String[]{"Maria", "Feminino"});
        pessoas.add(new String[]{"Pedro", "Masculino"});
        pessoas.add(new String[]{"Ana", "Feminino"});
        pessoas.add(new String[]{"Luana", "Feminino"});
        pessoas.add(new String[]{"Mariana", "Feminino"});

        List<String> mulheres = new ArrayList<>();
        pessoas.forEach(pessoa -> {
            if (pessoa[1].equals("Feminino")) {
                mulheres.add(pessoa[0]);
            }
        });

       
        mulheres.forEach(nome -> {
            assertTrue(pessoas.stream().anyMatch(pessoa -> pessoa[0].equals(nome) && pessoa[1].equals("Feminino")));
        });

        System.out.println("O teste passou! A lista contém apenas mulheres.");
    }
}

