package ChristmasSnack;

import java.util.Scanner;

public class AnalysingExamResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passedCounter = 0;
        int failedCounter = 0;

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter result: ");
            int result = input.nextInt();

            switch (result){
                case 1:
                    passedCounter++;
                    break;
                case 2:
                    failedCounter++;
                    break;
            }
        }

        System.out.println(passedCounter);
        System.out.println(failedCounter);

        if (passedCounter > 8){
            System.out.printf("Bonus to instructor! More than %d students passed", passedCounter);
        }else {
            System.out.printf("Below %d students passed, so no instructor bonus this semester", passedCounter);
        }
    }
}
