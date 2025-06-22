package singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();

        System.out.println("Logger A: " + loggerA.hashCode());
        System.out.println("Logger B: " + loggerB.hashCode());

        if (loggerA == loggerB) {
            System.out.println("Test Passed: Both loggers point to the same instance.");
        } else {
            System.out.println("Test Failed: Different instances were created.");
        }
    }
}
