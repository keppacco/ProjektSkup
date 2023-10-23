package artykuly;

public class Warzywo extends ArtykulRolniczy {
    public Warzywo(String nazwa, double cenaJednostkowa) {
        super(nazwa, cenaJednostkowa);
    }

    @Override
    public double obliczCene(int ilosc) {
        return getCenaJednostkowa() * ilosc;
    }
}
