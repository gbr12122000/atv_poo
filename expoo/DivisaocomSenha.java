import java.util.Scanner;

public class DivisaocomSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastrar a senha
        System.out.print("Cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        // Solicitar dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Solicitar a senha para verificação
        System.out.print("Digite a senha para continuar: ");
        String senhaInformada = scanner.next();

        // Verificar a senha
        if (senhaInformada.equals(senhaCadastrada)) {
            // Realizar a divisão e exibir o resultado
            if (numero2 != 0) {
                double resultado = (double) numero1 / numero2;
                System.out.printf("Resultado da divisão: %.2f%n", resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            // Mensagem de erro e encerrar o aplicativo
            System.out.println("Senha incorreta! Encerrando o aplicativo.");
            System.exit(0);
        }

        // Fechar o scanner
        scanner.close();
    }
}


