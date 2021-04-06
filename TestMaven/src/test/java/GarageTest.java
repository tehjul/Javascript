import ...

public class GarageTest {

    @Test
    public void vendre_avec_une_seule_voiture_presente(){
        Garage garage = new Garage();
        Voiture voiture = new Voiture("a");
        garage.getVoitures().add(voiture);

        garage.vendre(voiture);

        Assertions.assertThat(garage.getVoitures()).isEmpty();
    }

    @Test
    public void vendre_avec_deux_voitures_presente(){
        Garage garage = new Garage();
        Voiture voiture1 = new Voiture("a");
        Voiture voiture2 = new Voiture("b");
        garage.getVoitures().add(voiture1);
        garage.getVoitures().add(voiture2);

        garage.vendre(voiture1);

        assertThat(garage.getVoitures()).containsExactly(voiture1);
    }

    @Test
    public void acheter_une_voiture_avec_aucune_voiture_presente_initialement() {
        Garage garage = new Garage();
        Voiture voiture1 = new Voiture("a");
        Voiture voiture2 = new Voiture("b");
        garage.getVoitures().add(voiture1);

        garage.acheter(voiture2);

        assertThat(garage.getVoitures()).containsExactly(voiture1, voiture2);
    }

    @Test
    public void tester() {
        Garage garage = new Garage();
        Voiture voiture = new Voiture("z");

        String resultat = garage.tester(voiture);

        assertThat(resultat).isEqualTo("je roule");
    }
}