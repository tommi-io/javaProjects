package prodotto;


public class Prodotto{
  
  public String nome;
  public int quant;
  public int prezzo;
  
  /**
   * Costruttore di un generico prodotto
   *
   * @param nome dell'oggetto
   * @param quantita - quanto di un prodotto aggiungere.
   * @param prezzo del prodotto
   */
  public Prodotto( String nome, int quantita, int prezzo ){
    this.nome = nome;
    this.quant = quantita;
    this.prezzo = prezzo;
  }
  

  /**
   * Cambia il prezzo di un prodotto
   *
   * @param nuovoPrezzo - prezzo da assegnare all'oggetto.
   */
  public void cambioPrezzo(int nuovoPrezzo){
    this.prezzo = nuovoPrezzo;
  }
  
  /**
   * ritorna una stringa formattata descrittiva dell'oggetto, con informazioni relative a prezzo e quantità
   */
  @Override
  public String toString(){
    return String.format("%s, disponibilità: %d, prezzo: €%d", this.nome, this.quant, this.prezzo);    
  }

}

