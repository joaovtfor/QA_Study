//import java.util.NullPointerException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import calculator.Calculator;

public class CalculatorTest {

    int num1 = 5;
    int num2 = 10;
    int noNumber;
    
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(num1,num2);
        assertEquals(15, result);
    }
    
    @Test
    public void testSub() {
        int result = calculator.sub(num1,num2);
        assertEquals(5, result);
    }
    
    @Test
    public void testDiv() {
        int result = calculator.div(num2,num1);
        assertEquals(2, result);
    }
    
    @Test
    public void testMulti() {
        int result = calculator.multi(num1,num2);
        assertEquals(50, result);
    }

    //@Test(expected = java.util.NullPointerException.class)
    //public void testSumException() {
    //    int result = calculator.sum(num1, noNumber);
    //}
}
