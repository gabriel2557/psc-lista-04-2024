import java.util.Scanner;

public class ExercicioD5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;
            
            // Entrada da população e taxa de crescimento para o país A
            do {
                System.out.print("Digite a população inicial do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("A população inicial do país A deve ser maior que zero. Por favor, tente novamente.");
                }
            } while (populacaoA <= 0);
            
            do {
                System.out.print("Digite a taxa de crescimento anual do país A (%): ");
                taxaCrescimentoA = scanner.nextDouble() / 100.0;
                if (taxaCrescimentoA <= 0) {
                    System.out.println("A taxa de crescimento anual do país A deve ser maior que zero. Por favor, tente novamente.");
                }
            } while (taxaCrescimentoA <= 0);
            
            // Entrada da população e taxa de crescimento para o país B
            do {
                System.out.print("Digite a população inicial do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("A população inicial do país B deve ser maior que zero. Por favor, tente novamente.");
                }
            } while (populacaoB <= 0);
            
            do {
                System.out.print("Digite a taxa de crescimento anual do país B (%): ");
                taxaCrescimentoB = scanner.nextDouble() / 100.0;
                if (taxaCrescimentoB <= 0) {
                    System.out.println("A taxa de crescimento anual do país B deve ser maior que zero. Por favor, tente novamente.");
                }
            } while (taxaCrescimentoB <= 0);
            
            // Cálculo do número de anos necessário
            int anos = 0;
            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }
            
            System.out.println("Levará " + anos + " anos para a população do país A ultrapassar ou igualar a população do país B.");
            
            // Perguntar se deseja repetir a operação
            System.out.print("Deseja calcular novamente? (s/n): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
        
        scanner.close();
    }
}
