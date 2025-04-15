package prenotrist;

public class Prenotazioni {
    public String nome;
    public int n_persone;

    public Prenotazioni(String nome, int n_persone){
        this.nome = nome;
        this.n_persone = n_persone;
    }

    @Override
    public String toString(){
        return String.format("%s, %d persone", this.nome, this.n_persone);
    }
}
