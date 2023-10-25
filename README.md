# Maven Exercise

## Build a maven application named **Calculator**

### Requirements
1. Your application should accept three parameters:
- One operation
- Two numbers
- Treat conversion exceptions
- Friendly message
- Log
2. It should work with three different operations
3. You must separate the logic from the main class, creating another class.
4. You should create a class CalculatorResponse to print as a message. Use this class as an 
entity. Do not forget to implement the method toString(); this will be used as an output.
Example of fields: Status, operation, value1, value2, result, detail message
5. Throw business logic exceptions, e.g.: “Operation not found.”
6. The application must print the following message:
“The result is:” + <calculatorResponse object>
