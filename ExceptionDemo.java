public class ExceptionDemo {
        public static void main(String[] args) {
            try {
                int a = 10, b = 0;
                int c = a / b;
                System.out.println("Result: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e);
            } finally {
                System.out.println("Finally block executed");
            }
        }

    }
