import artykuly.ArtykulRolniczy;
import artykuly.Owoc;
import artykuly.Warzywo;
import sklep.SklepRolniczy;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        SklepRolniczy sklep = new SklepRolniczy();

        // Dodajmy kilka przykładowych artykułów
        Warzywo pomidor = new Warzywo("Pomidor", 2.5);
        Owoc jablko = new Owoc("Jabłko", 1.0);
        Warzywo marchew = new Warzywo("Marchew", 1.8);
        Owoc gruszka = new Owoc("Gruszka", 2.2);
        Warzywo cebula = new Warzywo("Cebula", 1.2);
        Owoc wisnia = new Owoc("Wiśnia", 3.0);
        Warzywo brokuly = new Warzywo("Brokuły", 2.8);
        Owoc arbuz = new Owoc("Arbuz", 4.5);
        Warzywo papryka = new Warzywo("Papryka", 2.0);
        Owoc malina = new Owoc("Malina", 2.7);

        // Dodajmy je do sklepu
        sklep.dodajArtykul(pomidor, 100);
        sklep.dodajArtykul(jablko, 50);
        sklep.dodajArtykul(marchew, 75);
        sklep.dodajArtykul(gruszka, 60);
        sklep.dodajArtykul(cebula, 90);
        sklep.dodajArtykul(wisnia, 40);
        sklep.dodajArtykul(brokuly, 70);
        sklep.dodajArtykul(arbuz, 30);
        sklep.dodajArtykul(papryka, 80);
        sklep.dodajArtykul(malina, 45);

        // Dodajmy kolejne przykładowe artykuły
        Warzywo ziemniak = new Warzywo("Ziemniak", 1.5);
        Owoc porzeczka = new Owoc("Porzeczka", 3.2);
        Warzywo szpinak = new Warzywo("Szpinak", 2.3);
        Owoc brzoskwinia = new Owoc("Brzoskwinia", 2.8);
        Warzywo baklazan = new Warzywo("Bakłażan", 2.1);
        Owoc pomarancza = new Owoc("Pomarańcza", 2.9);

        // Dodajmy kolejne artykuły do sklepu
        sklep.dodajArtykul(ziemniak, 120);
        sklep.dodajArtykul(porzeczka, 55);
        sklep.dodajArtykul(szpinak, 70);
        sklep.dodajArtykul(brzoskwinia, 45);
        sklep.dodajArtykul(baklazan, 85);
        sklep.dodajArtykul(pomarancza, 100);

        // Usuńmy kilka artykułów
        sklep.usunArtykul("Arbuz");
        sklep.usunArtykul("Cebula");

        // Znajdźmy i wyświetlmy informacje o jednym z artykułów
        ArtykulRolniczy znalezionyArtykul = sklep.znajdzArtykul("Ziemniak");
        if (znalezionyArtykul != null) {
            System.out.println("Znaleziono artykuł: " + znalezionyArtykul.getNazwa());
        }

        // Posortujmy artykuły alfabetycznie
        sklep.sortujArtykuly();
        List<ArtykulRolniczy> posortowaneArtykuly = sklep.pobierzArtykuly();
        System.out.println("Posortowane artykuły:");
        for (ArtykulRolniczy artykul : posortowaneArtykuly) {
            System.out.println(artykul.getNazwa());
        }

        double wartoscMagazynu = sklep.obliczWartoscMagazynu();
        System.out.println("Wartość magazynu: " + wartoscMagazynu + " zł");
    }
}
