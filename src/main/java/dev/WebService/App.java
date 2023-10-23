package dev.WebService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(
                    "Usage: java -cp target/Calculator-1.0-SNAPSHOT.jar dev.WebService.App <operation> <num1> <num2>");
            System.exit(1);
        }

        String operation = args[0];
        double value1 = 0;
        double value2 = 0;

        try {
            value1 = Double.parseDouble(args[1]);
            value2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid value " + e.getMessage());
            System.exit(1);
        }

        Calculator calculator = new Calculator();
        double result = 0;

        if (operation.equals("+")) {
            result = calculator.add(value1, value2);
        } else if (operation.equals("-")) {
            result = calculator.subtract(value1, value2);
        } else if (operation.equals("'*'")) {
            result = calculator.multiply(value1, value2);
        } else {
            System.out.println("Please enter correct operation (+,-,*)");
            System.exit(1);
        }

        CalculatorResponse response = new CalculatorResponse(operation, value1, value2, result);
        System.out.println(response.getMessage());
    }
}
