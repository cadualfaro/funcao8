/*
Atividade 5

Criar uma função que recebe um inteiro N, e retorna um vetor de tamanho N com números aleatórios
 */
package funcao8;
    import java.util.Scanner;
    import java.util.Random;
        public class Funcao8 {

static int vetor(int n){
    Random rand = new Random();
        int vetor1[] = new int [n];
    
    System.out.println("");
    
    for(int i=0;i<vetor1.length;i++){
        n = rand.nextInt(10);
            System.out.printf("%d; ", n);
    }
    
    return n;
}
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
            System.out.println("Digite o valor referente ao tamanho do vetor: ");
                int tamanho = vetor(my_scan.nextInt());
    }
    
}
