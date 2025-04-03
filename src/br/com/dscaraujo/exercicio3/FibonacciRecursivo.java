public class FibonacciRecursivo {
    public static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int entrada = 40;
        System.out.println("Fibonacci(" + entrada + ") = " + fibonacci(entrada));
    }
}

