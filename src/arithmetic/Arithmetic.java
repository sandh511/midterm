package arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        UserInputHandler inputHandler = new UserInputHandler();

        double x = inputHandler.getOperand();
        double y = inputHandler.getOperand();

        Operation operation = inputHandler.getOperation();
        r.setOperation(operation);

        double result = r.calculate(x, y);
        System.out.println("Result: " + result);
    }
}
