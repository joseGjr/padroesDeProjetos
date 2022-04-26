package entities;

public class Individual extends TaxPaer {
    private double helthExpenditures;

    public Individual(double helthExpenditures) {
        this.helthExpenditures = helthExpenditures;
    }
    public Individual(String name, double anualIncome, double helthExpenditures) {
        super(name, anualIncome);
        this.helthExpenditures = helthExpenditures;
    }
    public double getHelthExpenditures() {
        return helthExpenditures;
    }

    public void setHelthExpenditures(double helthExpenditures) {
        this.helthExpenditures = helthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getAnualIcome()<20000.0){
            basicTax = getAnualIcome()*15.0;
        }
        else {
            basicTax = getAnualIcome()* 0.25;
        }
        basicTax = basicTax - (getHelthExpenditures() *0.5);
        if (basicTax < 0.0){
            basicTax = 0.0;
        }
        return 0;
    }
}
