package application;
import entities.Company;
import entities.Individual;
import entities.TaxPaer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPaer> List = new ArrayList<TaxPaer>();

        System.out.println("Entre com número de contribuintes: ");
        int N = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Contribuinte #" + i + " dada: ");
            System.out.println(" Individual or company ? (i/c)");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual Income: ");
            double anualIcome = sc.nextDouble();
            if (type == 'i') {
                System.out.println("HelthExpenditures: ");
                double he = sc.nextDouble();
                double helthExpenditures = 0;
                Individual x = new Individual(name, anualIcome, helthExpenditures);
                List.add(x);
            } else {
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                List.add(new Company(name, anualIcome, numberOfEmployees));
            }
            System.out.println();
            System.out.println("TAXES PAID: ");
            for (TaxPaer tp : List) {
                System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
            }
            System.out.println();
            sum = 0.0;
            for (TaxPaer tp : List) {
                sum += tp.tax();
            }
        }
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
        sc.close();
    }
}
