package dev.WebService;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorResponseTest {

    @Test
    public void testToString() {
        CalculatorResponse response = new CalculatorResponse("+", 5.0, 3.0, 8.0);
        String expected = "The result of 5.0 + 3.0 is: 8.0";
        assertEquals(expected, response.getMessage());
    }

}
