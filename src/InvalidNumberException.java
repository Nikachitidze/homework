
public class InvalidNumberException extends Exception {

    private static final String ERROR_CAUSE = "Error!!!";

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException() {
        super(ERROR_CAUSE);
    }
}
