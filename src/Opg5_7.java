public class Opg5_7 {
    public static void main(String[] args) {
        double tuition = 10000;
        double totalCost = 0;
        int tuitionAfter10thYear;
        double tuition10thYear = 0;
                for (int year = 1;year<15; year++) {
                    System.out.println(year);
                    tuition *= 1.05;
                    System.out.println(tuition);
                    if (year > 10)
                        totalCost += tuition;
                    if (year == 10)
                    tuition10thYear += tuition;}
        System.out.println("Cost of tuition at 10th year " + tuition10thYear);
        System.out.println("Total cost of 4 years tuition after 10 years is: "+(int)totalCost+"$");



    }
}
