package ba.unsa.etf.rpr;

public class Artikl {
    String naziv,kod;
    int  cijena;

    public Artikl(String biciklo, int i, String s) {
        this.naziv=biciklo;
        this.cijena=i;
        this.kod=s;
    }

    public Artikl() {
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }

}
