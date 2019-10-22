package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli = new Artikl[1000];

    public boolean dodajArtikl(Artikl a) {
        int i=0;
        while(artikli[i]!=null) i++;
        artikli[i]=a;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String s) {
        Artikl neki = new Artikl();
        int i = 0;
        while (artikli[i] != null) {
            Artikl a = artikli[i];
            if (s.equals(a.kod)) {
                int j = i;
                neki=artikli[i];
                while (artikli[j + 1] != null) {
                    artikli[j] = artikli[j + 1];
                    j++;
                }
                neki=artikli[i];
            }
            i++;
        }
        artikli[i-1]=null;
        return neki;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}