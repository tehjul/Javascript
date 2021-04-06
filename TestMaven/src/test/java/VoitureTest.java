import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class VoitureTest {

    @Test
    public void rouler() {
        Voiture voiture = new Voiture("Citroen");

        String s = voiture.rouler();

        Assertions.assertThat(s).isEqualTo("je roule");
    }
}