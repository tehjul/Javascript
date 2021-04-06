public class Voiture {
    private String nom;

    public Voiture(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String rouler(){
        return "je roule";
    }
}
