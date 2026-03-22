import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListaTest {
    private Lista l;
    private Tarefa t;

    @BeforeEach
    void setUp(){
        t = new Tarefa(1);
        l = new Lista();
    }

    @Test
    void constroi(){
        assertTrue(l.getTarefas().isEmpty());
    }
    @Test
    void adicionaIguais(){
        l.adiciona(t);
        Tarefa t2 = new Tarefa(1);
        l.adiciona(t2);

        assertEquals(1,l.getTarefas().size());
    }
    @Test
    void adicionaDiferentes(){
        l.adiciona(t);
        Tarefa t3 = new Tarefa(3);
        l.adiciona(t3);

        assertEquals(2,l.getTarefas().size());
    }
}
