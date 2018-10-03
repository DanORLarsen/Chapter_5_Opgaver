import java.util.Scanner;

public class Opg5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer, ends if = 0");
        int result = 0;
        int posCount = 0;
        int negCount = 0;
        int nr = sc.nextInt();
        while (nr != 0){
        result += nr;

        if (nr >=0){posCount++;}
        if (nr < 0) {negCount++;}
            nr = sc.nextInt();
        }
        System.out.println("positive numbers: "+posCount);
        System.out.println("Negative numbers: "+negCount);
        System.out.println("Sum of entered numbers: "+result);

    }
}
