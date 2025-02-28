
/**
 * Engenharia de Software Moderna - Testes  (Cap. 8)
 * Prof. Marco Tulio Valente
 *
 * Exemplo de Teste de Unidade - Classe Stack
 *
 */
import java.util.EmptyStackException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import stacktest.Stack;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void init() {
        stack = new Stack<Integer>();
    }

    @Test
    public void testEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNotEmptyStack() {
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSizeStack() {
        stack.push(10);
        stack.push(20);
       // stack.push(30);
        int size = stack.size();
        assertEquals(2, size);
    }

    @Test
    public void testPushPopStack() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int result = stack.pop();
        result = stack.pop();
        assertEquals(20, result);
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testEmptyStackException() {
        stack.push(10);
        int result = stack.pop();
        result = stack.pop();
    }

    @Test
    public void testEmptyStackException1() {
        boolean sucesso = false;
        try {
            Stack s = new Stack<Integer>();
            s.push(10);
            int r = stack.pop();
            r = stack.pop();
        } catch (EmptyStackException e) {
            sucesso = true;
        }
        assertTrue(sucesso);
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testEmptyStackException2() {
        stack.push(10);
        int result = stack.pop();
        result = stack.pop();
    }
}
