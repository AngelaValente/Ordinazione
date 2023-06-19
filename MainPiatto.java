import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class MainPiatto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> elencoUtente = new ArrayList<>();
        boolean flag = true;
        Menu nuovoMenu = new Menu();
        while(flag){
            System.out.println("Vuoi effettuare una registrazione o accedere?");
            System.out.println("1. Registrazione.");
            System.out.println("2. Accedere.");
            System.out.println("3. Uscita.");
            int scelta = scanner.nextInt();
            switch(scelta){
                case 1: 
                    String nomeUtente;
                    scanner.nextLine();
                    do {
                        System.out.println("Inserisci il tuo nome utente: ");
                        nomeUtente = scanner.nextLine();
                    } while(nomeUtentePresente(elencoUtente, nomeUtente));
                    System.out.println("Inserisci la tua password: ");
                    //scanner.nextLine();
                    String passwordUtente = scanner.nextLine(); 
                    elencoUtente.add(nomeUtente);
                    System.out.println("Registrazione effettuata con successo!");
                    Menu.sceltaMenu();
                    break;   
                case 2: 
                    String nomeUtente1;
                    scanner.nextLine();
                    System.out.println("Inserisci il tuo nome utente: ");
                    nomeUtente1 = scanner.nextLine();
                    boolean trovato1 = false;
                    for(int i = 0; i < elencoUtente.size(); i++){
                        if(Objects.equals(nomeUtente1, elencoUtente.get(i))){
                            System.out.println("Accesso effettuato con successo.");
                            trovato1 = true;
                            Menu.sceltaMenu();
                        }
                    if(!trovato1){
                        System.out.println("Siamo spiacenti, accesso negato.");
                    } 
                    }
                    break;
                case 3: 
                    System.out.println("Grazie per averci scelto, arrivederci!.");
                    break;
                default: 
                    System.out.println("Siamo spiacenti, l'operazione selezionata non è disponibile.");
                    flag = false;
                    break;
            }
        }


    }

    public static boolean nomeUtentePresente(ArrayList<String> elencoUtente, String nomeUtente) {
        for (int i = 0; i < elencoUtente.size(); i++) { //Crea una lista studenti di tipo studente.
            if (Objects.equals(elencoUtente.get(i), nomeUtente)) {
                System.out.println("Credenziali già in uso, riprova!");
            return true;
            }
        }
    return false;
    }
}

//Devo completare dei metodi e il main con delle operazioni.
