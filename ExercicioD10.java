import java.util.Scanner;

public class ExercicioD10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");
        
        if (numero1 < numero2) {
            for (int i = numero1 + 1; i < numero2; i++) {
                System.out.println(i);
            }
        } else if (numero1 > numero2) {
            for (int i = numero2 + 1; i < numero1; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Os números são iguais. Não há intervalo.");
        }
        
        scanner.close();
    }
}
