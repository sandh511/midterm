package arithmetic;

import java.util.Scanner;

public class UserInputHandler {
    public Operation getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = scanner.next().toUpperCase();
        return Operation.valueOf(input);
    }

    public double getOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operand: ");
        return scanner.nextDouble();
    }
}
