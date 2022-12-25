package ChristmasSnack;

import java.util.Scanner;

public class EmployeesSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int officeHours = 40;

        for (int i = 1; i <= 3; i++){
            System.out.println("Number of hours worked last week: ");
            int hoursWorked = input.nextInt();
            System.out.println("Enter your hourly rate: ");
            double hourlyRate = input.nextDouble();

            double grossPay;
            if (hoursWorked > 40){
                grossPay = officeHours * hourlyRate + (1.5 * (hourlyRate));
            }
            else {
                grossPay = hoursWorked * hourlyRate;
            }

            System.out.println("Gross pay for employee " + i + " is N" + grossPay );
        }
    }
}
