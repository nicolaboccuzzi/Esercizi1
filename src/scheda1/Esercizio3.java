package scheda1;

public class Esercizio3 {
    public static int fattoriale_iterativo(int n){
        if(n<0){
            System.out.println("ERRORE!,Input negativo");
            return-1;
        }
        int fatt=1;
        for(int i =1; i<=n; i++){
            fatt*=i;
        }
        return fatt;
    }

    public static int fattoriale_ricorsivo(int n){
        if(n<=1)return 1;
        else return n*fattoriale_ricorsivo(n-1);
    }
}
