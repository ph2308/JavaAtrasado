import java.util.ArrayList;
import java.util.Scanner;

public class Permutacoes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira os elementos do conjunto separados por espaço: ");
        String[] elementos = input.nextLine().split(" ");
        ArrayList<String> lista = new ArrayList<String>();
        for (String elemento : elementos) {
            lista.add(elemento);
        }
        permuta(lista, new ArrayList<String>());
    }

    public static void permuta(ArrayList<String> lista, ArrayList<String> escolhidos) {
        if (lista.isEmpty()) {
            System.out.println(escolhidos);
            return;
        }
        for (String elemento : lista) {
            ArrayList<String> novaLista = new ArrayList<String>(lista);
            novaLista.remove(elemento);
            ArrayList<String> novosEscolhidos = new ArrayList<String>(escolhidos);
            novosEscolhidos.add(elemento);
            permuta(novaLista, novosEscolhidos);
        }
    }
}