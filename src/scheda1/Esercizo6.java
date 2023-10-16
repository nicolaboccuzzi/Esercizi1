package scheda1;

public class Esercizo6 {
        public static int[]doubleOdd(int[] array ){
           int[] copy=new int[array.length]; // creo un array vuoto di stessa lunghezza di quello in input
            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==1){
                    copy[i]= array[i]*2;
                }
                else copy[i]=array[i];
            }
            return copy;
        }

}
