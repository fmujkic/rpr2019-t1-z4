package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {

        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Brašno", 20, "10");
        assertTrue(korpa.dodajArtikl(artikl));
    }

    @Test
    void getArtikli() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Brašno", 20, "10");
        korpa.dodajArtikl(artikl);
        assertEquals(artikl, korpa.getArtikli()[0]);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Brašno", 20, "10");
        korpa.dodajArtikl(artikl);
        korpa.izbaciArtiklSaKodom("10");
        assertNull(korpa.getArtikli()[0]);

    }

    @Test
    void dajUkupnuCijenuArtikala() {

        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Brašno", 20, "10"));
        korpa.dodajArtikl(new Artikl("Brašno", 213, "10"));
        korpa.dodajArtikl(new Artikl("Brašno", 67, "10"));
        assertEquals(300,korpa.dajUkupnuCijenuArtikala());
    }
}