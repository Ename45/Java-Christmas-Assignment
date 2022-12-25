package ChristmasSnack;

import java.util.Scanner;

public class ClassAverageOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalScore = 0;


        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter score on quiz: ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100){
                totalScore += score;
            }
            else {
                counter--;
                System.out.println("Enter valid score");
            }
        }
        double classAverage = totalScore / 10;
        System.out.println(totalScore);
        System.out.println(classAverage);
    }
}
