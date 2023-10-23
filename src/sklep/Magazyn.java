package sklep;

import artykuly.ArtykulRolniczy;

interface Magazyn {
    void dodajArtykul(ArtykulRolniczy artykul, int ilosc);
    void kupArtykul(String nazwa, int ilosc);
    double obliczWartoscMagazynu();
}
