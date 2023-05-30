public class MatrizPrimos {

    public static boolean contemPrimo(int[][] matriz) {
        if (matriz.length == 0) {
            return false;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (isPrimo(matriz[i][j])) {
                    return true;
                } else {
                    int[][] novaMatriz = removeLinha(matriz, i);
                    novaMatriz = removeColuna(novaMatriz, j);
                    if (contemPrimo(novaMatriz)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] removeLinha(int[][] matriz, int linha) {
        int[][] novaMatriz = new int[matriz.length - 1][matriz[0].length];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i != linha) {
                for (int j = 0; j < matriz[0].length; j++) {
                    novaMatriz[k][j] = matriz[i][j];
                }
                k++;
            }
        }
        return novaMatriz;
    }

    public static int[][] removeColuna(int[][] matriz, int coluna) {
        int[][] novaMatriz = new int[matriz.length][matriz[0].length - 1];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j != coluna) {
                    novaMatriz[i][k] = matriz[i][j];
                    k++;
                }
            }
            k = 0;
        }
        return novaMatriz;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        if (contemPrimo(matriz)) {
            System.out.println("A matriz contém pelo menos um número primo.");
        } else {
            System.out.println("A matriz não contém nenhum número primo.");
        }
    }
}