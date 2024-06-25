import java.util.Scanner;

public class CalculoINSS {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Solicitando nome:
        System.out.print("Digite nome do funcionário :  ");
        String nome = leitor.nextLine();

        // Solicitando salário:
        System.out.print("Digite salário fixo (em reais): ");
        double salarioFixo = leitor.nextDouble();

        // Calculando desconto INSS:
        double descontoinss;

        if (salarioFixo <= 1412.0) {
            descontoinss = salarioFixo * 0.075;
        } else if (salarioFixo <= 2666.68) {
            descontoinss = salarioFixo * 0.09;
        } else if (salarioFixo <= 4000.03) {
            descontoinss = salarioFixo * 0.12;
        } else if (salarioFixo <= 7786.02) {
            descontoinss = salarioFixo * 0.14;
        } else {
            descontoinss = 7786.02; // Desconto maximo
        }

        // Calculando salário líquido:
        double salarioLiq = salarioFixo - descontoinss;

        // Imprimindo resultados:
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Desconto do INSS: R$" + descontoinss);
        System.out.println("Salário líquido: R$" + salarioLiq);

        // fechando scanner:
        leitor.close();
    }
}
