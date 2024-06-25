import java.util.Scanner;

public class somadoisnumeros {
    public static void main(String[] args) {
        // Criando instância da classe Scanner para ler entrada do teclado:
        Scanner leitor = new Scanner(System.in);

        // Solicitando e lendo dois números:
        System.out.println("Digite o primeiro número :  ");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número :  ");
        int numero2 = leitor.nextInt();

        // Calculando soma, subtração, multiplicação e divisão dos números:
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;

        // Imprimindo os resultados:
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
        System.out.println("A divisão dos dois números é: " + divisao);

        // Fechando Scanner:
        leitor.close();
    }
}
