package entities;

public abstract class TaxPaer {
    private String name;
    private double anualIcome;

    public TaxPaer(){
    }

    public TaxPaer(String name, double anualIcome) {
        this.name = name;
        this.anualIcome = anualIcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIcome() {
        return anualIcome;
    }

    public void setAnualIcome(double anualIcome) {
        this.anualIcome = anualIcome;
    }
    public abstract double tax();
}
