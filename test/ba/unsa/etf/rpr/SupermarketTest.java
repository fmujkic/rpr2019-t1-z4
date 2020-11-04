package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {

        Supermarket supermarket = new Supermarket();
        Artikl artikl = new Artikl("Brašno", 20, "10");
        assertTrue(supermarket.dodajArtikl(artikl));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl = new Artikl("Brašno", 20, "10");
        supermarket.dodajArtikl(artikl);
        supermarket.izbaciArtiklSaKodom("10");
        assertNull(supermarket.getArtikli()[0]);
    }


}