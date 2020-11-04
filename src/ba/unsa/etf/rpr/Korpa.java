package ba.unsa.etf.rpr;

class Korpa {

   private  Artikl[] artikli = new Artikl[50];

    boolean dodajArtikl(Artikl a) {
        int i = 0;
        while (artikli[i] != null) i++;
        artikli[i] = a;
        return true;
    }

     Artikl[] getArtikli() {
        return artikli;
    }

    Artikl izbaciArtiklSaKodom(String s) {

        Artikl neki = new Artikl();
        int i = 0;

        while (artikli[i] != null) {
            Artikl a = artikli[i];
            if (s.equals(a.kod)) {
                int j = i;
                while (artikli[j + 1] != null) {
                    artikli[j] = artikli[j + 1];
                    j++;
                }

                neki = artikli[i];
            }
            i++;
        }



        artikli[i - 1] = null;
        return neki;
    }

    int dajUkupnuCijenuArtikala() {
        int suma = 0;
        int i = 0;
        while (artikli[i] != null) {
            suma += artikli[i].cijena;
            i++;
        }
        return suma;
    }
}
