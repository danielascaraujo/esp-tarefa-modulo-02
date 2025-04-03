import java.util.HashMap;
import java.util.Map;

public class FibonacciTopDown {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long resultado = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int entrada = 40;
        System.out.println("Fibonacci(" + entrada + ") = " + fibonacci(entrada));
    }
}
