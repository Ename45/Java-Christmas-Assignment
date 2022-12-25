package ChristmasSnack;

import java.util.Scanner;

public class ClassAverageTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalGrade = 0;
        int counter = 0;

        System.out.println("Enter your grade or input -1 to exit: ");
        int grade = input.nextInt();

        while (grade != -1){
            if (grade >= 0 && grade <= 100){
                totalGrade += grade;
            }
            else {
                counter--;
                System.out.println("Enter valid grade");
            }
            counter++;
            System.out.println("Enter your grade or input -1 to exit: ");
            grade = input.nextInt();
        }


        if (counter != 0){
            double classAverage = totalGrade/counter;
            System.out.printf("The total of %d grades entered is %.2f", counter, totalGrade);
            System.out.printf("%nTherefore, the class average is %.2f",classAverage);
        }
        else {
            System.out.println("No grade has been inputted");
        }
    }
}
