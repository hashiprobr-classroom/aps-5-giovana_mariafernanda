import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TarefaTest {
    private Tarefa t;

    @BeforeEach
    void setUp(){
        t = new Tarefa(5);
    }

    @Test
    void constroi(){
        assertEquals(5,t.getId());
        assertEquals("",t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }
    @Test
    void mudaDescricao(){
        t.setDescricao("Desagil");
        assertEquals("Desagil",t.getDescricao());
    }
    @Test
    void momentosValidos(){

        Data inicio = new Data(1970,1,1);
        inicio.atualiza(1970,1,1);

        Data fim = new Data(1970,1,2);
        fim.atualiza(1970,1,2);

        t.atualiza(inicio,fim);

        assertEquals(inicio,t.getInicio());
        assertEquals(fim,t.getFim());
    }

    @Test
    void momentosInvalidos(){
        Data inicio = new Data(1970,1,2);
        inicio.atualiza(1970,1,2);

        Data fim = new Data(1970,1,1);
        fim.atualiza(1970,1,1);

        try{
            t.atualiza(inicio,fim);
            System.out.println("Início deveria ser antes do fim");
        } catch(IllegalArgumentException e){

        }
    }
}
