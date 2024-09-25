import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o peso e a altura
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcular o IMC
        double imc = peso / (altura * altura);

        // Exibir o IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Classificação do IMC
        String situacao;
        if (imc < 18.5) {
            situacao = "Magro";
        } else if (imc < 25.0) {
            situacao = "Normal";
        } else if (imc < 30.0) {
            situacao = "Sobrepeso";
        } else if (imc < 35.0) {
            situacao = "Obeso";
        } else if (imc < 40.0) {
            situacao = "Obesidade mórbida";
        } else {
            situacao = "Obesidade extrema";
        }

        // Exibir a situação
        System.out.println("Sua situação é: " + situacao);

        // Fechar o scanner
        scanner.close();
    }
}