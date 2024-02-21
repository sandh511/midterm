package arithmetic;

public class ArithmeticBase {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double x, double y) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set");
        }

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
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}
