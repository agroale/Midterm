package arithmetic;

import java.util.Scanner;

// Enum to represent arithmetic operations
enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

/** 
 * This class takes enum input (PLUS, MINUS, TIMES, DIVIDE) from the user 
 * and executes the arithmetic operation
 * 
 * @author sivagamasrinivasan
 */
public class ArithmeticBase {
    public double x, y;

    double calculate(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        
        // Use the Operation enum for input
        Operation operation = Operation.valueOf(sc.next().toUpperCase());

        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
