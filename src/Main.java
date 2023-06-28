import java.util.Scanner;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;

        // Criando as matrizes
        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] matrizMultiplicacao = new int[linhas][colunas];

        // Lendo os valores da primeira matriz
        System.out.println("Digite os valores da primeira matriz:");
        lerValoresMatriz(matriz1);

        // Lendo os valores da segunda matriz
        System.out.println("Digite os valores da segunda matriz:");
        lerValoresMatriz(matriz2);

        // Calculando a multiplicação das matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizMultiplicacao[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        // Exibindo as matrizes
        System.out.println("Primeira matriz:");
        exibirMatriz(matriz1);

        System.out.println("\nSegunda matriz:");
        exibirMatriz(matriz2);

        System.out.println("\nMatriz Multiplicação:");
        exibirMatriz(matrizMultiplicacao);
    }

    // Método para ler os valores da matriz a partir da entrada do usuário
    public static void lerValoresMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para exibir a matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}