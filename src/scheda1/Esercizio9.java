package scheda1;

import java.util.Arrays;

public class Esercizio9 {

    public static void anagrammi(String a, String b){

        a= a.toLowerCase().replaceAll( "\\s", "");
        b= b.toLowerCase().replaceAll("\\s", "");
        if(a.length()!=b.length()){ //controlla se hanno stessa lunghezza
            System.out.println("Non anagrammi");
            return;
        }
        char[] array_a= a.toCharArray();//creo array di caratteri di a
        char[] array_b= b.toCharArray();
        Arrays.sort(array_a); //ordino l'array in ordine alfabetico
        Arrays.sort(array_b);
        if(Arrays.equals(array_a, array_b)){ //controlla se sono uguali
            System.out.println("ANAGRAMMI");
        }else{
            System.out.println("non sono anagrammi");
        }



    }
}
