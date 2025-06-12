import java.util.Arrays;
import java.util.Random;

 class VetoresPosicoesAleatorias {
    public static void main(String[] args) {
        int [] vetor1 = new int[50];
        int [] vetor2 = new int[50];

        preencherComAleatorios (vetor1);
        preencherComAleatorios (vetor2);

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        System.out.println("vetor 1 (ordenado): ");
        imprimirVetor(vetor1);

        System.out.println("\nvetor 2 (ordenado): ");
        imprimirVetor(vetor2);


        int[] vetorCombinado = new int[100];

        System.arraycopy(vetor1, 0,vetorCombinado, 0, 50);
        System.arraycopy(vetor2, 0, vetorCombinado, 50, 50);

        Arrays.sort(vetorCombinado);
        System.out.print("\nvetor combinado e ordenado: ");
        imprimirVetor(vetorCombinado);
    }
    public static void preencherComAleatorios(int[] vetor){
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = random.nextInt(1000);
            
        }
    }
    public static void imprimirVetor(int[]vetor){
        for (int num : vetor){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
