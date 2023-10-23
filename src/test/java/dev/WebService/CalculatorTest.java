package dev.WebService;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    double result = 0;

    @Test
    public void testAdd() {
        result = calculator.add(2.0, 4.0);
        assertEquals("testEquals", 6.0, result, 0);
    }

    @Test
    public void testSubtract() {
        result = calculator.subtract(6.0, 4.0);
        assertEquals("testEquals", 2.0, result, 0);
    }

    @Test
    public void testMultiply() {
        result = calculator.multiply(6.0, 4.0);
        assertEquals("testEquals", 24.0, result, 0);
    }

}
