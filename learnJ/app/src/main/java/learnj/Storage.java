package storage;

import java.util.ArrayList; 
import prodotto.Prodotto;


public class Storage{
  
  ArrayList<Prodotto> inventario;
  
  /**
   * costruttore di uno storage: inizializza una lista vuota di prodotti
   */
  public Storage(){
    this.inventario = new ArrayList<>();
  }
    
  public void addProdotto( Prodotto p ){
    int t = posInInventario(p);
    if(t == -1){
      inventario.add(p); 
    }
    else{
      inventario.get(t).quant += p.quant;
    }
  }
  
   public void remProdotto(String n, int q){
    Prodotto temp = new Prodotto(n, q, 0);
    int t = posInInventario(temp);
    if( t == -1 ){
      System.out.print("impssibile rimuovere, elemento non presente");
    }
    else{
      if( inventario.get(t).quant > q ){
        inventario.get(t).quant -= q;
        System.out.print("rimossi " + q + " elementi\n");
      }
      else{
        System.out.print("rimossi " + inventario.get(t).quant + " elementi\n");
        inventario.get(t).quant = 0;
      }
    }
  }

  public String cercaProdotto( String s ){
    for( Prodotto p : inventario ){
      if (p.nome.equals(s)){
        return p.toString();
      }
    }
    return "prodotto non in lista, usa 'h' per sapere come inserirlo";
  }

  private int posInInventario( Prodotto p ){
    for( int i = 0; i < inventario.size(); i++ ){
      if (p.nome.equals(inventario.get(i).nome)){
        return i;
      }
    }
    return -1; 
  }
 
  @Override
  public String toString(){
    String s = "";
    for( Prodotto p : inventario ){
      s = String.format("%s\n%s", s, p.toString());
    }
    return String.format("%s\n", s);
  }
}
