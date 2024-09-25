import java.util.Scanner;

public class VerificaVencedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de gols do Nacional de Patos
        System.out.print("Digite o número de gols do Nacional de Patos: ");
        int golsNacional = scanner.nextInt();

        // Ler o número de gols do Treze
        System.out.print("Digite o número de gols do Treze: ");
        int golsTreze = scanner.nextInt();

        // Verificar o vencedor
        if (golsNacional > golsTreze) {
            System.out.println("Nacional de Patos é o vencedor!");
        } else if (golsTreze > golsNacional) {
            System.out.println("Treze é o vencedor!");
        } else {
            System.out.println("EMPATE");
        }

        // Fechar o scanner
        scanner.close();
    }
}
