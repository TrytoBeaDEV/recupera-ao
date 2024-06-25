
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Solicitando idade em dias:
        System.out.print("Digite a sua idade em dias : ");
        int idadeDias = leitor.nextInt();

        // Calculando idade em anos, meses e dias:
        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;

        // Imprimindo resultados:
        System.out.println("Idade : " + anos + "  Anos , " + meses + " Meses  e  " + dias + " Dias ;) ");

        // Fechando scanner:
        leitor.close();
    }
}
