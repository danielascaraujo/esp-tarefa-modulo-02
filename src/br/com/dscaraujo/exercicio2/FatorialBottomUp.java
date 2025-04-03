package br.com.dscaraujo.exercicio2;

import java.math.BigInteger;

public class FatorialBottomUp {
    public static BigInteger calcularFatorial(int n) {
        BigInteger[] tabela = new BigInteger[n + 1];
        tabela[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            tabela[i] = tabela[i - 1].multiply(BigInteger.valueOf(i));
        }

        return tabela[n];
    }

    public static void main(String[] args) {
        int entrada1 = 3;
        int entrada2 = 7;

        System.out.println("Entrada: " + entrada1 + " -> Saída: " + calcularFatorial(entrada1));
        System.out.println("Entrada: " + entrada2 + " -> Saída: " + calcularFatorial(entrada2));
    }
}

// Sobre calcular fatorial de um número acima de 100 com recursão
// Com uma abordagem recursiva pura, como sem memoization, o problema enfrentado é o número excessivo de chamadas recursivas, o que pode levar ao estouro de pilha.
// Já uma abordagem top-down com memoization ajuda a minimizar esse problema, mas ainda pode encontrar limites de profundidade de recursão.
// A melhor solução para valores grandes é a abordagem bottom-up com BigInteger, que evita recursão e consegue lidar com números enormes.