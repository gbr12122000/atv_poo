import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a senha do usuário
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Verificar a validade da senha
        if (senha.equals("123456")) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
