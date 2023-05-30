import java.util.Scanner;

public class SomaDigitos {

    public static int somaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + somaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int n = scanner.nextInt();
        int soma = somaDigitos(n);
        System.out.println("A soma dos dígitos de " + n + " é " + soma + ".");
    }
}