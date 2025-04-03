package br.com.dscaraujo.exercicio3;

public class FibonacciBottomUp {
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[] tabela = new long[n + 1];
        tabela[0] = 0;
        tabela[1] = 1;

        for (int i = 2; i <= n; i++) {
            tabela[i] = tabela[i - 1] + tabela[i - 2];
        }

        return tabela[n];
    }

    public static void main(String[] args) {
        int entrada = 40;
        System.out.println("Fibonacci(" + entrada + ") = " + fibonacci(entrada));
    }
}

// Por que Programação Dinâmica é Melhor?
//Redução de Complexidade: De O(2ⁿ) para O(n) — um ganho enorme!
//Evita chamadas redundantes: Memoization salva resultados em cache.
//Performance muito superior: Calcula Fibonacci para valores enormes rapidamente.
//Elimina riscos de estouro de pilha: A abordagem bottom-up usa iteração, evitando profundidade recursiva excessiva