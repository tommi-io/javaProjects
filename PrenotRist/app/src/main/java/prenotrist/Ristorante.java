package prenotrist;

import java.util.ArrayList;

/**
 * -
 */
public class Ristorante {
    public String nomeRistorante;
    public ArrayList<Integer> tavoliDisponibili; 
    public GestorePrenotazioni gestore;

    /** - */
    public Ristorante(String nome, int... tavoli){
        this.nomeRistorante = nome;
        this.tavoliDisponibili = new ArrayList<Integer>();
        this.gestore = new GestorePrenotazioni();
        for(int t : tavoli){
            this.tavoliDisponibili.add(t);
        }
    }


    @Override
    public String toString(){
        String ristoranteStr = "";
        ristoranteStr = String.format("%s: \n", this.nomeRistorante);
        ristoranteStr = String.format("%stavoli disponibili: ", ristoranteStr);
        for(int i : tavoliDisponibili){
            ristoranteStr = String.format("%s %d", ristoranteStr, i);
        }
        ristoranteStr = String.format("%s\n%s\n", ristoranteStr, gestore.toString());
        return ristoranteStr;
    }
}
