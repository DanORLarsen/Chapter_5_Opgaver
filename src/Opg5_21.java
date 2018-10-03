import java.util.Scanner;

public class Opg5_21 {
    public static void main(String[] args) {
        double i = 4.875;
        System.out.println("Enter loan ammount");
        Scanner sc = new Scanner(System.in);
        int loan = sc.nextInt();
        System.out.println("Enter how many years you will pay back in");
        int years = sc.nextInt();
        System.out.println("Interest Rate      Monthly payment       Total payment");
        for (i = 5.000; i <= 8;i+=0.125)
        {
            System.out.printf("%-18.3f",i);
            System.out.print(" ");
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loan * monthlyInterestRate/(1-1 /Math.pow(1+monthlyInterestRate,years*12));
            System.out.printf("%-22.2f", monthlyPayment);
            System.out.printf("%-18.2f\n",(monthlyPayment * 12) * years);


        }

    }
}
