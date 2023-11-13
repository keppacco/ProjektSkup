# ProjektSkup

## Opis Projektu
Projekt Sklep Rolniczy jest aplikacją konsolową napisaną w języku Java. Sklep umożliwia zarządzanie artykułami rolniczymi, takimi jak warzywa i owoce, poprzez dodawanie, usuwanie, edycję i wyświetlanie produktów.

## Struktura Projektu
- `src/` - Źródłowy folder zawierający kod źródłowy aplikacji.
  - `artykuly/` - Pakiet zawierający klasy związane z artykułami rolniczymi.
  - `sklep/` - Pakiet zawierający klasę reprezentującą sklep rolniczy.
  - `Main.java` - Główna klasa zawierająca funkcję `main`.

## Instrukcje Uruchomienia
1. Skompiluj projekt.
2. Uruchom główną klasę `Main` w środowisku Java.

## Funkcjonalności
- Dodawanie artykułów rolniczych do sklepu.
- Usuwanie artykułów rolniczych ze sklepu.
- Edycja informacji o artykułach.
- Wyświetlanie listy dostępnych produktów w sklepie.

## Instrukcje Użycia
1. Uruchom projekt.
2. Wybierz akcję:
   - Dodaj produkt.
   - Usuń produkt.
   - Edytuj produkt.
   - Wyświetl produkty.
   - Zakończ program.

## Przykładowe Działanie
```java
public class Main {
    public static void main(String[] args) {
        SklepRolniczy sklep = new SklepRolniczy();

        // Dodawanie produktów do sklepu
        // ...

        // Wyświetlanie listy produktów
        sklep.wypiszProdukty();
    }
}

Autor: Piotr Łata 
