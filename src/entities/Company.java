package entities;

public class Company extends TaxPaer {
    private Integer numberOfEmployees;

    public Company(String name, double anualIcome, Integer numberOfEmployees) {
        super(name, anualIcome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10){
            return getAnualIcome()* 0.14;
        }
        else {
            return getAnualIcome()*0.16;
        }
    }
}
