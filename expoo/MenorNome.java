import java.util.Scanner;

public class MenorNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        // Solicitar ao usuário que digite 5 nomes
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Encontrar o menor nome
        String menorNome = nomes[0];
        for (int i = 1; i < nomes.length; i++) {
            if (nomes[i].compareTo(menorNome) < 0) {
                menorNome = nomes[i];
            }
        }

        // Exibir o menor nome
        System.out.println("O menor nome (mais próximo da letra A) é: " + menorNome);

        // Fechar o scanner
        scanner.close();
    }
}

