package br.com.dscaraujo.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long resultado = n * calcularFatorial(n - 1);
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int entrada1 = 3;
        int entrada2 = 7;

        System.out.println("Entrada: " + entrada1 + " -> Saída: " + calcularFatorial(entrada1));
        System.out.println("Entrada: " + entrada2 + " -> Saída: " + calcularFatorial(entrada2));
    }
}
