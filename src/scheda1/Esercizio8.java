package scheda1;

public class Esercizio8 {
   /* Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale ogni numero Ë definito dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1. Esempio: 0, 1, 1,2, 3, 5, 8, 13, 21, 34, ... E cosÏ via.Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e cosÏ via.
*/

    public static int esercizio8(int n){
        if(n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }else {
            int n1=0,n2=1,fib=0;
            for (int i = 2; i <=n; i++) {
                fib=n2+n1;
                n1=n2;
                n2=fib;
            }

            return fib;
        }
    }
}

