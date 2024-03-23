import java.util.Scanner;

public class ExercicioD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite seu nome de usuário: ");
            String username = scanner.nextLine();
            
            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();
            
            if (password.equals(username)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Por favor, tente novamente.\n");
            } else {
                System.out.println("Usuário e senha cadastrados com sucesso!");
                break;
            }
        }
        
        scanner.close();
    }
}