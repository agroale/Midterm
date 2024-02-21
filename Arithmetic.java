package arithmetic;

import java.util.Scanner;

// Enum to represent arithmetic operations
enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

// Class for handling user input
class ArithmeticInput {
    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static Operation readOperation() {
        System.out.println("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String choice = new Scanner(System.in).next().toUpperCase();

        switch (choice) {
            case "PLUS":
                return Operation.PLUS;
            case "MINUS":
                return Operation.MINUS;
            case "TIMES":
                return Operation.TIMES;
            case "DIVIDE":
                return Operation.DIVIDE;
            default:
                System.out.println("Invalid choice.");
                return null; // or handle it accordingly
        }
    }
}

// Main class
public class Arithmetic {
    public static void main(String[] args) {
        double x = ArithmeticInput.readDouble();
        double y = ArithmeticInput.readDouble();
        Operation operation = ArithmeticInput.readOperation();

        if (operation != null) {
            ArithmeticBase calculator = new ArithmeticBase();
            double result = calculator.calculate(x, y, operation);
            System.out.println("Result: " + result);
        }
    }
}
