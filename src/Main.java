import scheda1.Esercizi1;
import scheda1.Esercizio3;
import scheda1.Esercizio4;
import scheda1.esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

         /* String s = input.nextLine();
        System.out.println("La stringa ha lunghezza dispari" + Esercizi1.esercizo1(s));

        System.out.println("Inserisci una stringa da invertire");
        String parola = input.nextLine();
        System.out.println(esercizio2.invertiStringa(parola));

        System.out.println("Inserisci il numero da calcolare il fattoriale");
        int a = input.nextInt();
        System.out.println("Il fattoriale di "+a+" vale " + Esercizio3.fattoriale_ricorsivo(a));
*/
        System.out.println("Inserisci il numero da calcolare l'ora");
        int number = input.nextInt();
        System.out.println(Esercizio4.esercizio4(number));
    }
}