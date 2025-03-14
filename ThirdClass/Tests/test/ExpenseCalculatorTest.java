import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class ExpenseCalculatorTest {
    private ExpenseCalculator calc;

    @Before
    public void setUp() {
        calc = new ExpenseCalculator();
    }

    // Testes para addExpense
    @Test
    public void testAddExpenseValid() {
        assertTrue(calc.addExpense(50.0, "Food"));
    }

    @Test
    public void testAddExpenseNegativeAmount() {
        assertFalse(calc.addExpense(-10.0, "Food"));
    }

    @Test
    public void testAddExpenseNaN() {
        assertFalse(calc.addExpense(Double.NaN, "Food"));
    }

    @Test
    public void testAddExpenseEmptyCategory() {
        assertFalse(calc.addExpense(50.0, ""));
    }

    @Test
    public void testAddExpenseNullCategory() {
        assertFalse(calc.addExpense(50.0, null));
    }

    // Testes para getCategoryTotal
    @Test
    public void testGetCategoryTotalEmpty() {
        assertEquals(0.0, calc.getCategoryTotal("Food"), 0.001);
    }

    @Test
    public void testGetCategoryTotalValid() {
        calc.addExpense(50.0, "Food");
        calc.addExpense(30.0, "Food");
        calc.addExpense(20.0, "Transport");
        assertEquals(80.0, calc.getCategoryTotal("Food"), 0.001);
    }

    @Test
    public void testGetCategoryTotalCaseInsensitive() {
        calc.addExpense(50.0, "FOOD");
        assertEquals(50.0, calc.getCategoryTotal("food"), 0.001);
    }

    @Test
    public void testGetCategoryTotalInvalidCategory() {
        calc.addExpense(50.0, "Food");
        assertEquals(0.0, calc.getCategoryTotal(""), 0.001);
    }

    @Test
    public void testGetCategoryTotalNonexistent() {
        calc.addExpense(50.0, "Food");
        assertEquals(0.0, calc.getCategoryTotal("Transport"), 0.001);
    }

    @Test
    public void testGetCategoryTotalNullCategory() {
        calc.addExpense(50.0, "Food");
        assertEquals(0.0, calc.getCategoryTotal(null), 0.001);
    }
}