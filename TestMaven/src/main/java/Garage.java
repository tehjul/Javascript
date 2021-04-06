import java.util.ArrayList;
import java.util.List;

public class Garage {
    private list<Voiture> voitures;

    public Garage() {
        voitures = new Arraylist<>();
    }

    public list<Voiture> getVoitures() {
        return voitures;
    }

    public void vendre(final Voiture voiture) {
        voitures.remove(voiture);
    }

    public void acheter(final Voiture voiture) {
        voitures.add(voiture);
    }

    public String tester(final Voiture voiture) {
        return voiture.rouler();
    }
}