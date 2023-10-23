package dev.WebService;

public class CalculatorResponse {

    private String message;

    public CalculatorResponse(String operation, double num1, double num2, double result) {
        this.message = "The result of " + num1 + " " + operation + " " + num2 + " is: " + result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage() {
        this.message = message;
    }

}
