package scheda1;

public class Esercizio10 {

    public static int diagonale_matrice(int[][] matrice) {
        int somma = 0;
        for (int i = 0; i < matrice.length; i++) {
            somma += matrice[i][i];
        }
        return somma;
    }

    public static int diagonale_matrice2(int[][] matrice, boolean choise) {
        int somma = 0;
        if (choise) return diagonale_matrice(matrice);
        for (int i = 0; i <matrice.length ; i++) {
            somma+= matrice[i][matrice.length-1-i];
        }
        return somma;
    }


    }

