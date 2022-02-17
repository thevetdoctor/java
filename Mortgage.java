import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
        public static void main(String[] args) {
            System.out.println("Mortgage Calculator");
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);

            // Formula
            // M = P * r * ((1 + r)**n)
            //         ----------------
            //         ((1 + r)**n) - 1

            try {
                System.out.print("Principal: ");
                String principal = scanner1.nextLine();

                System.out.print("Annual Interest Rate: ");
                String annualInterestRate = scanner2.nextLine();

                System.out.print("Period (Years): ");
                String period = scanner3.nextLine();

                double p = Double.parseDouble(principal);
                double r = Double.parseDouble(annualInterestRate) / 12 / 100;
                double n = Double.parseDouble(period) * 12;
                
                double numerator = r * Math.pow(1 + r, n);
                double denominator = Math.pow(1 + r, n) - 1;
                double numeratorDividedByDenominator = numerator / denominator;
                double mortgage = p * numeratorDividedByDenominator;

                System.out.println("Mortgage: " + currency.format(mortgage));
            }
            finally {
                if(scanner1!=null)
                    scanner1.close();
                if(scanner2!=null)
                    scanner2.close();
                if(scanner3!=null)
                    scanner3.close();
            }
    }
}
