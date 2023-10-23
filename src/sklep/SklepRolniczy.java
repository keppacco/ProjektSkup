package sklep;

import artykuly.ArtykulRolniczy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SklepRolniczy implements Magazyn {
    private Map<String, Integer> magazyn;
    private Map<String, ArtykulRolniczy> dostepneArtykuly;
    private List<ArtykulRolniczy> artykulyLista;

    public SklepRolniczy() {
        magazyn = new HashMap<>();
        dostepneArtykuly = new HashMap<>();
        artykulyLista = new ArrayList<>();
    }

    public static double obliczCeneArtykulu(ArtykulRolniczy artykul, int ilosc) {
        if (artykul == null) {
            throw new IllegalArgumentException("Artykuł nie może być pusty.");
        }
        return artykul.obliczCene(ilosc);
    }

    @Override
    public void dodajArtykul(ArtykulRolniczy artykul, int ilosc) {
        if (artykul == null) {
            throw new IllegalArgumentException("Artykuł nie może być pusty.");
        }
        if (ilosc <= 0) {
            throw new IllegalArgumentException("Ilość artykułów musi być większa od zera.");
        }
        String nazwa = artykul.getNazwa();
        magazyn.put(nazwa, magazyn.getOrDefault(nazwa, 0) + ilosc);
        dostepneArtykuly.put(nazwa, artykul);
        artykulyLista.add(artykul);
    }

    @Override
    public void kupArtykul(String nazwa, int ilosc) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa artykułu nie może być pusta.");
        }
        if (ilosc <= 0) {
            throw new IllegalArgumentException("Ilość artykułów musi być większa od zera.");
        }
        if (magazyn.containsKey(nazwa)) {
            int dostepnaIlosc = magazyn.get(nazwa);
            if (dostepnaIlosc >= ilosc) {
                magazyn.put(nazwa, dostepnaIlosc - ilosc);
                double cena = obliczCeneArtykulu(dostepneArtykuly.get(nazwa), ilosc);
                System.out.println("Kupiono " + ilosc + " sztuk " + nazwa + " za " + cena + " zł.");
            } else {
                System.out.println("Brak wystarczającej ilości artykułów " + nazwa + " w magazynie.");
            }
        } else {
            System.out.println("Artykuł " + nazwa + " nie jest dostępny w magazynie.");
        }
    }

    @Override
    public double obliczWartoscMagazynu() {
        double suma = 0;
        for (Map.Entry<String, Integer> entry : magazyn.entrySet()) {
            String nazwa = entry.getKey();
            int ilosc = entry.getValue();
            double cena = obliczCeneArtykulu(dostepneArtykuly.get(nazwa), ilosc);
            suma += cena;
        }
        return suma;
    }

    public void usunArtykul(String nazwa) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa artykułu nie może być pusta.");
        }
        if (magazyn.containsKey(nazwa)) {
            magazyn.remove(nazwa);
            dostepneArtykuly.remove(nazwa);
            // Usuwamy także z listy artykułów
            artykulyLista.removeIf(artykul -> artykul.getNazwa().equals(nazwa));
            System.out.println("Usunięto artykuł: " + nazwa);
        } else {
            System.out.println("Artykuł " + nazwa + " nie istnieje w magazynie.");
        }
    }

    public ArtykulRolniczy znajdzArtykul(String nazwa) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa artykułu nie może być pusta.");
        }
        if (dostepneArtykuly.containsKey(nazwa)) {
            return dostepneArtykuly.get(nazwa);
        } else {
            System.out.println("Artykuł " + nazwa + " nie istnieje w dostępnych artykułach.");
            return null;
        }
    }

    public void sortujArtykuly() {
        Collections.sort(artykulyLista, (a1, a2) -> a1.getNazwa().compareTo(a2.getNazwa()));
    }

    public List<ArtykulRolniczy> pobierzArtykuly() {
        return artykulyLista;
    }


}
