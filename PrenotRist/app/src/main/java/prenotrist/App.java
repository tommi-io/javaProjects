package prenotrist;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Ristorante r = new Ristorante("Mimmo", 2,2,2,4,4,6,6,6);
        Scanner sc = new Scanner(System.in);
        
        /*comandi:
         crea ristorante R
         aggiungi tavoli A
         prenota P
         cancella prenotazione C
         help H
        */
        System.out.println("inserisci comando: ");
        char comando = sc.next().charAt(0);
        comando = Character.toLowerCase(comando);

        switch (comando) {
            case 'R':
                
                
                break;
        
            default:
                break;
        }
        
        System.out.println(r.toString());

        r.gestore.prenotaTavolo("carlo", 4, r.tavoliDisponibili);
        System.out.println(r.toString());
        r.gestore.prenotaTavolo("stefano", 2, r.tavoliDisponibili);
        System.out.println(r.toString());
        r.gestore.cancellaPrenotazione("carlo", r.tavoliDisponibili);
        System.out.println(r.toString());
        
    }
}
