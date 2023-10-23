package artykuly;

public class Owoc extends ArtykulRolniczy {
    public Owoc(String nazwa, double cenaJednostkowa) {
        super(nazwa, cenaJednostkowa);
    }

    @Override
    public double obliczCene(int ilosc) {
        // Dodajmy 10% rabatu na owoce
        return getCenaJednostkowa() * ilosc * 0.9;
    }
}
