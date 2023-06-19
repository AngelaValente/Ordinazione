import java.util.ArrayList;

public class Piatto{
    //Attributi.
    public ArrayList<String> elencoIngrediente;
    public double prezzo;
    public String chef;

    //Costruttore.
    // public Piatto(String ingrediente, double prezzo, String chef){
    //     this.ingrediente = ingrediente;
    //     this.prezzo = prezzo;
    //     this.chef = chef;
    // }

    //Metodi.
    public void setIngrediente(ArrayList<String> elencoIngrediente){
        this.elencoIngrediente = elencoIngrediente;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public void setChef(String chef){
        this.chef = chef;
    }

    public ArrayList<String> getIngrediente() {
        return elencoIngrediente;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getChef() {
        return chef;
    }
}
