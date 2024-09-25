import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar um número correspondente ao dia da semana
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int dia = scanner.nextInt();

        // Exibir o dia correspondente
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido! Digite um número de 1 a 7.");
        }

        // Fechar o scanner
        scanner.close();
    }
}

