import java.util.Scanner;

public class MatrizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz quadrada (Ex: 3 para 3x3): ");
        int tamanho = scanner.nextInt();

        int [][] matriz = new int [tamanho] [tamanho];

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                    matriz [i] [j] = scanner.nextInt();
                
            }
        }
        int SomaDiagonal = 0;
        for (int i = 0; i < tamanho; i++) {
            SomaDiagonal += matriz[i][i];
        }
        System.out.println("A soma da diagonal principal é: " + SomaDiagonal);

            scanner.close();

    }
}
