import java.util.Scanner;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;

public class Opg5_34 {
    public static void main(String[] args) {
        System.out.println("Game of \"Rock,Paper and Scissor\" ");
    Scanner sc = new Scanner(System.in);

        System.out.println("Pick \"Rock\" , \"Paper\" or \"Scissor\"");
        String choise;
        int wins = 0;

        String[] pcChoise = {"Paper","Rock","Scissor"};


        while (wins <3) {
            choise = sc.next();

            if (choise.equalsIgnoreCase("Scissor")) ;
            { if (pcChoise[(int) (Math.random() * 3)] == "Paper") {
                    wins++;System.out.println("You won");
                }//Muligvis tilføj nyt choise inden i wins++
                else
                    System.out.println("you lost or got a draw");}

                if (choise.equalsIgnoreCase("Paper")) {
                    if (pcChoise[(int) (Math.random() * 3)] == "Rock") {
                        wins++;System.out.println("You won");
                    } //Se over
                    else
                        System.out.println("you lost or got a draw");}

                    if (choise.equalsIgnoreCase("Rock")) {
                        if (pcChoise[(int) (Math.random() * 3)] == "Scissor") {
                            wins++;
                            System.out.println("You won");}

                        //se over
                        else
                            System.out.println("you lost or got a draw");}
                    }

                }

            }