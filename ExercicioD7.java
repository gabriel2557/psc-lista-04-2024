import java.util.Scanner;

public class ExercicioD7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variável para armazenar o maior número
        int maior = Integer.MIN_VALUE;
        
        // Loop para ler os números e encontrar o maior
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
        }
        
        // Imprimir o maior número
        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }
}