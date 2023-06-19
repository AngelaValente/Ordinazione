import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Menu extends Piatto {

    public void creaPiatto(){
        Piatto nuovoPiatto = new Piatto();
        nuovoPiatto.setIngrediente(elencoIngrediente);
        nuovoPiatto.setPrezzo(prezzo);
        nuovoPiatto.setChef(chef);
    }

    public void stampaPiatto(Piatto nuovoPiatto){
        System.out.println(nuovoPiatto.getIngrediente());
        System.out.println(nuovoPiatto.getPrezzo());
        System.out.println(nuovoPiatto.getChef());
    }

    public static void sceltaMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operazioni disponibili: ");
        System.out.println("1. Elenco delle pietanze.");
        System.out.println("2. Scelta piatto.");
        System.out.println("3. Stampa prezzo.");
        System.out.println("4. Stampa ordine.");
        System.out.println("5. Uscita.");
        int scelta = scanner.nextInt();
        switch(scelta){
            case 1: 
            break;
        }
    }
}
