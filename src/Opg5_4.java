public class Opg5_4 {
    public static void main(String[] args) {
        System.out.println("Miles      Kilometers");
        int miles = 0;

        for (miles = 1;miles<=10;miles++) {
            double kilometers = miles*1.609;
            System.out.printf("%2d          %6.3f\n", miles ,kilometers);
        }


    }
}
