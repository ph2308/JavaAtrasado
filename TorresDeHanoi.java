import java.util.Scanner;

public class TorresDeHanoi {

    public static void torresDeHanoi(int n, String torreOrigem, String torreAuxiliar, String torreDestino) {
        if (n == 1) {
            System.out.println("Mover disco 1 da torre " + torreOrigem + " para a torre " + torreDestino);
        } else {
            torresDeHanoi(n - 1, torreOrigem, torreDestino, torreAuxiliar);
            System.out.println("Mover disco " + n + " da torre " + torreOrigem + " para a torre " + torreDestino);
            torresDeHanoi(n - 1, torreAuxiliar, torreOrigem, torreDestino);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de discos: ");
        int n = scanner.nextInt();
        torresDeHanoi(n, "A", "B", "C");
    }
}