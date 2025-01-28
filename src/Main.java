
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos fazer a soma de dois numeros: ");
        System.out.println("Digite o primeiro numero: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o segundo numero: ");
        double b = sc.nextDouble();
        sc.nextLine();

        double resultadoSoma = a + b;
        System.out.printf("O resultado da soma e: %.0f", resultadoSoma);

        sc.close();

    }
}
