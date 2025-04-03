public class Fatorial {
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        int entrada1 = 3;
        int entrada2 = 7;

        System.out.println("Entrada: " + entrada1 + " -> Saída: " + calcularFatorial(entrada1));
        System.out.println("Entrada: " + entrada2 + " -> Saída: " + calcularFatorial(entrada2));
    }
}

//* Sobre calcular o fatorial de um número acima de 100 com uma abordagem recursiva: tecnicamente, é possível, mas não é recomendado.
// Isso porque a recursão gera uma grande profundidade de chamadas de função, o que pode levar a um estouro de pilha (StackOverflowError) em Java.
// Além disso, os valores resultantes crescem exponencialmente, ultrapassando rapidamente os limites dos tipos primitivos numéricos, como long.
// Para lidar com números grandes, o ideal é usar BigInteger em uma abordagem iterativa, evitando problemas de recursão profunda.