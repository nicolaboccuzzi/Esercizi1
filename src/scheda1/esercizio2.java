package scheda1;

public class esercizio2 {

    public static String invertiStringa(String s) {
        String inversa = ""; // dichiaro un anuova variaile dove salvo l'inversa
        for (int i = s.length() - 1; i >= 0; i--) {
           inversa += s.charAt(i);
        }
        return inversa;
    }
}
