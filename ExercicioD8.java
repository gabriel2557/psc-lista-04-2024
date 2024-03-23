import java.util.Scanner;

public class ExercicioD8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar a soma e a média
        int soma = 0;
        double media;
        
        // Loop para ler os números e calcular a soma
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        // Calcular a média
        media = (double) soma / 5;
        
        // Exibir a soma e a média
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}
