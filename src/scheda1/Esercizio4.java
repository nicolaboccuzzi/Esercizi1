package scheda1;

public class Esercizio4 {
    public static String esercizio4(int nSecondi){
        int giorni=(nSecondi/86400);
        int resto=(nSecondi% 86400);
        int ore= resto/3600;
        resto=resto%3600;

        int minuti= resto/60;
        int secondi=resto%60;
        return "Giorni: "+giorni+"Ore "+ore+"Minuti "+"Secondi "+secondi+"";
    }
}
