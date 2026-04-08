
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
         @Test
    void testAddition() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    void testAdditionDifferentValues() {
        assertEquals(7, calc.add(3,4));
    }

    @Test
    void testAdditionNegative() {
        assertEquals(-2, calc.add(-1,-1));
    }

    }
}
