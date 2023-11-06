import artykuly.ArtykulRolniczy;
import artykuly.Owoc;
import artykuly.Warzywo;
import sklep.SklepRolniczy;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        SklepRolniczy sklep = new SklepRolniczy();


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
        Warzywo kapusta = new Warzywo("Kapusta", 1.2);
        Owoc arbuz3 = new Owoc("Arbuz", 4.5);
        Warzywo pietruszka = new Warzywo("Pietruszka", 1.0);
        Owoc arbuz2 = new Owoc("Arbuz", 4.0);
        Warzywo kalafior = new Warzywo("Kalafior", 2.0);
        Owoc winogrono = new Owoc("Winogrono", 3.5);
        Warzywo rukola = new Warzywo("Rukola", 1.8);
        Owoc brzoskwinia2 = new Owoc("Brzoskwinia", 3.0);
        Warzywo burak = new Warzywo("Burak", 1.5);
        Owoc cytryna = new Owoc("Cytryna", 2.0);
        Warzywo kapusta2 = new Warzywo("Kapusta", 1.3);
        Owoc mango = new Owoc("Mango", 5.0);
        Warzywo seler = new Warzywo("Seler", 1.6);
        Owoc ananas = new Owoc("Ananas", 4.0);
        Warzywo szparagi = new Warzywo("Szparagi", 2.5);
        Owoc truskawka = new Owoc("Truskawka", 3.2);
        Warzywo rzodkiewka = new Warzywo("Rzodkiewka", 1.0);
        Owoc papaja = new Owoc("Papaja", 4.5);
        Warzywo por = new Warzywo("Por", 2.2);


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
        sklep.dodajArtykul(kapusta, 80);
        sklep.dodajArtykul(arbuz, 35);
        sklep.dodajArtykul(pietruszka, 60);
        sklep.dodajArtykul(arbuz2, 40);
        sklep.dodajArtykul(kalafior, 70);
        sklep.dodajArtykul(winogrono, 45);
        sklep.dodajArtykul(rukola, 55);
        sklep.dodajArtykul(brzoskwinia2, 30);
        sklep.dodajArtykul(burak, 75);
        sklep.dodajArtykul(cytryna, 50);
        sklep.dodajArtykul(kapusta2, 65);
        sklep.dodajArtykul(mango, 25);
        sklep.dodajArtykul(seler, 85);
        sklep.dodajArtykul(ananas, 20);
        sklep.dodajArtykul(szparagi, 95);
        sklep.dodajArtykul(truskawka, 42);
        sklep.dodajArtykul(rzodkiewka, 68);
        sklep.dodajArtykul(papaja, 22);
        sklep.dodajArtykul(por, 88);


        Warzywo ziemniak = new Warzywo("Ziemniak", 1.5);
        Owoc porzeczka = new Owoc("Porzeczka", 3.2);
        Warzywo szpinak = new Warzywo("Szpinak", 2.3);
        Owoc brzoskwinia = new Owoc("Brzoskwinia", 2.8);
        Warzywo baklazan = new Warzywo("Bakłażan", 2.1);
        Owoc pomarancza = new Owoc("Pomarańcza", 2.9);


        sklep.dodajArtykul(ziemniak, 120);
        sklep.dodajArtykul(porzeczka, 55);
        sklep.dodajArtykul(szpinak, 70);
        sklep.dodajArtykul(brzoskwinia, 45);
        sklep.dodajArtykul(baklazan, 85);
        sklep.dodajArtykul(pomarancza, 100);


        sklep.usunArtykul("Arbuz");
        sklep.usunArtykul("Cebula");


        ArtykulRolniczy znalezionyArtykul = sklep.znajdzArtykul("Ziemniak");
        if (znalezionyArtykul != null) {
            System.out.println("Znaleziono artykuł: " + znalezionyArtykul.getNazwa());
        }


        sklep.sortujArtykuly();
        List<ArtykulRolniczy> posortowaneArtykuly = sklep.pobierzArtykuly();
        System.out.println("Posortowane artykuły:");
        for (ArtykulRolniczy artykul : posortowaneArtykuly) {
            System.out.println(artykul.getNazwa());
        }

        double wartoscMagazynu = sklep.obliczWartoscMagazynu();
        System.out.println("Wartość magazynu: " + Math.floor(wartoscMagazynu) + " zł");
    }
}
