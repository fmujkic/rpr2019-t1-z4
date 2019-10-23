package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {

        Artikl artikl = new Artikl("Brašno", 20, "10");
        assertEquals("Brašno", artikl.naziv);

    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Brašno", 20, "10");
        assertEquals("10", artikl.kod);
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Brašno", 20, "10");
        assertEquals(20, artikl.cijena);
    }
}