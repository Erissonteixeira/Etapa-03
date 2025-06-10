import java.util.Random;

public class OrdenandoVetor {
    public static void main(String[] args) {

        int[] numeros = new int[100];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Vetor antes da ordenação: ");
        exibirVetor(numeros);
        bubblesort(numeros);

        System.out.println("\n\nVetor depois da ordenação");
        exibirVetor(numeros);

    }
    public static void exibirVetor(int[] vetor){
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
    public static void bubblesort(int[] vetor){
        for (int i = 0; i < vetor.length - 1 ; i++) {
            for (int j = 0; j < vetor.length - 1 -  i; j++) {
                if (vetor[j] > vetor [j+ 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j + 1] = temp;
                }
                
            }
            
        }

    }
}
