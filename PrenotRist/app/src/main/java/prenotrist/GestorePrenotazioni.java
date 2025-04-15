package prenotrist;

import java.util.ArrayList;

/**
 * .
 */
public class GestorePrenotazioni {
    public ArrayList<Prenotazioni> listaPrenotazioni;

    /** . */
    public GestorePrenotazioni(){
        this.listaPrenotazioni = new ArrayList<Prenotazioni>();
    }

    /**
     * metodo che permette di aggiungere un numero indefinito di tavoli al ristorante
     * @param tavoli
     */
    private void addTavolo(ArrayList<Integer> disponibilita, int tavolo){
        disponibilita.add(tavolo);
    }

    /**
     * metodo che rimuove un tavolo dai tavoli disponibili
     * @param tavolo {@code int} che corrisponde al numero di persone del tavolo
     */
    private void remTavolo(ArrayList<Integer> disponibilita, int tavolo){
        disponibilita.remove(tavolo);
    }

    /**
     * aggiunge una prenotazione p alla lista delle prenotazioni.
     * @param p
     */
    private void addPrenotazione(Prenotazioni p){
        listaPrenotazioni.add(p);
    }
    /**
     * rimuove una prenotazione p dalla lista delle prenotazioni.
     * @param p
     */
    private void remPrenotazione(Prenotazioni p){
        listaPrenotazioni.remove(p);
    }
    /**
     * aggiunge una prenotazione
     * @param nome
     * @param n_persone
     * @param disponibilita
     * @return {@code true} se la prenotazione va a buon fine, {@code false} altrimenti.
     */
    public Boolean prenotaTavolo(String nome, int n_persone, ArrayList<Integer> disponibilita){
        for(int i : disponibilita){
            if(i == n_persone){
                remTavolo(disponibilita, n_persone);
                addPrenotazione(new Prenotazioni(nome, n_persone));
                return true;
            }
        }
        return false;
    }

    /**
     * cancella una prenotazione
     * @param nome
     * @param n_persone
     * @param disponibilita
     * @return {@code true} se la cancellazione va a buon fine, {@code false} altrimenti.
     */
    public Boolean cancellaPrenotazione(String nome, ArrayList<Integer> disponibilita){
        for(Prenotazioni p : listaPrenotazioni){
            if(p.nome == nome){
                addTavolo(disponibilita, p.n_persone);
                remPrenotazione(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String strPrenotazioni = "";
        for(Prenotazioni p : listaPrenotazioni){
            strPrenotazioni = String.format("%s%s\n", strPrenotazioni, p.toString());
        }
        return strPrenotazioni;
    }
}
