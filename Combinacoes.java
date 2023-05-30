import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinacoes {

    public static void combinacoes(int[] conjunto, int k, int n, int inicio, List<Integer> combinacao, List<List<Integer>> combinacoes) {
        if (k == 0) {
            combinacoes.add(new ArrayList<>(combinacao));
            return;
        }
        if (n < k) {
            return;
        }
        for (int i = inicio; i < conjunto.length; i++) {
            combinacao.add(conjunto[i]);
            combinacoes(conjunto, k - 1, n - 1, i + 1, combinacao, combinacoes);
            combinacao.remove(combinacao.size() - 1);
        }
        combinacoes(conjunto, k, n - 1, inicio, combinacao, combinacoes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de k: ");
        int k = scanner.nextInt();
        System.out.print("Informe o valor de n: ");
        int n = scanner.nextInt();

        int[] conjunto = new int[n];
        for (int i = 0; i < n; i++) {
            conjunto[i] = i + 1;
        }

        List<List<Integer>> combinacoes = new ArrayList<>();
        List<Integer> combinacao = new ArrayList<>();

        combinacoes(conjunto, k, n, 0, combinacao, combinacoes);

        System.out.println("Combinacoes:");
        for (List<Integer> c : combinacoes) {
            System.out.println(c);
        }
    }
}