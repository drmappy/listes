public class Noeud {
    public int valeur;
    public Noeud suivant;
    public Noeud (int valeur){
        this.valeur = valeur;
        this.suivant = null;
    }
    public String toString() {
        return String.valueOf(valeur);
    }
}