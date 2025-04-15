package learnj;

import java.util.Scanner;
import prodotto.Prodotto;
import storage.Storage;

public class App {

  public static Storage i; 

  public static void main(String[] args) {
    
    i = new Storage();

    Scanner sc = new Scanner( System.in );

   while(true){

    System.out.print( "\n-inserisci 'h' per lista comandi\n" );
    System.out.print( "-inserisci comando: " );     
  
     String comando = sc.nextLine();
      if( comando.length() == 1 && comando.charAt(0) == 'q' ){
        return;
      }
      else{
        gestisciComando( comando );
      }
    }
  }  
    
  private static void gestisciComando( String comando ){

    String[] partiComando = comando.split(" "); 

    switch ( comando.charAt(0) ){
      case 'h':
        printHelp();
        break;
      case 'a': 
        i.addProdotto( new Prodotto( partiComando[1], Integer.parseInt(partiComando[2]), Integer.parseInt(partiComando[3]) ) );
        break;
      case 'i':
        System.out.print(i.toString());
        break;
      case 'r':
        i.remProdotto(partiComando[1], Integer.parseInt(partiComando[2]));
        break;
      case 'c':
        System.out.print(i.cercaProdotto(partiComando[1]));
        break;
      default:
        System.out.print("dont do shit\n\n");
      
    }
  }

  private static void printHelp(){
    System.out.print( "\nlista comandi: \n a string_nome int_quantita' int_prezzo\n r stirng_nome int_quantita'\n" );
    System.out.print( " c string_nome \n i\n q\n\n a: aggiunge il prodotto, sovrascrive il prezzo\n r: rimuove una quantità di un prodotto, se è presente\n" );     
    System.out.print( " c: cerca un prodotto in base al nome, se è presente ritorna quantità e prezzo\n i: stampa il contenuto dell'inventario\n q: quit\n\n" );      
  }
}

