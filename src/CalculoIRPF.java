
import java.util.Scanner;

public class CalculoIRPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitando nome do funcionário:
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        //Solicitando salário:
        System.out.print("Digite o salário (em reais): ");
        double salarioFixo = scanner.nextDouble();

        //Calculando desconto IRPF:
        double irpf;
        if (salarioFixo <= 2259.20) {
            irpf = 0.0; // Isento
        } else if (salarioFixo <= 2826.65) {
            irpf = salarioFixo * 0.075;
        } else if (salarioFixo <= 3751.05) {
            irpf = salarioFixo * 0.15;
        } else if (salarioFixo <= 4664.68) {
            irpf = salarioFixo * 0.2255;
        } else {
            irpf = salarioFixo * 0.275;
        }

        // Calcula o salário líquido
        double salarioLiquido = salarioFixo - irpf;

        // Exibe os resultados
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário fixo: $" + salarioFixo);
        System.out.println("Desconto do IRPF: $" + irpf);
        System.out.println("Salário líquido: $" + salarioLiquido);

        scanner.close();
    }
}
