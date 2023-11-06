package artykuly;

public abstract class ArtykulRolniczy {
    private String nazwa;
    private double cenaJednostkowa;

    public ArtykulRolniczy(String nazwa, double cenaJednostkowa) {
        setNazwa(nazwa);
        setCenaJednostkowa(cenaJednostkowa);
    }

    public ArtykulRolniczy(String nazwa) {
        this(nazwa, 0);
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    private void setNazwa(String nazwa) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa artykułu nie może być pusta.");
        }
        this.nazwa = nazwa;
    }

    private void setCenaJednostkowa(double cenaJednostkowa) {
        if (cenaJednostkowa <= 0) {
            throw new IllegalArgumentException("Cena jednostkowa musi być większa od zera.");
        }
        this.cenaJednostkowa = cenaJednostkowa;
    }

    public abstract double obliczCene(int ilosc);

    public double obliczCene() {
        return obliczCene(1);
    }
}
