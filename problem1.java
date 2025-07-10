public class Calculator {

    // Inputs
    private double a;
    private double b;
    private String operation;

    // Constructor
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); // Normalize operation string
    }

    // Method to perform calculation
    public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation type.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(10.5, 5.5, "add");
        System.out.println("Result: " + calc1.calculate());

        Calculator calc2 = new Calculator(20.0, 4.0, "divide");
        System.out.println("Result: " + calc2.calculate());
    }
}
