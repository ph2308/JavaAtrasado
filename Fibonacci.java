import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de n: ");
        int n = scanner.nextInt();
        int fib = fibonacci(n);
        System.out.println("O " + n + "º número de Fibonacci é " + fib + ".");
    }
}