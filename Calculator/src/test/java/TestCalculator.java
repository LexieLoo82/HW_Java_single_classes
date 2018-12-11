import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void canDivide(){
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add(4, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(10, 7));
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(10, 5));
    }
}
