package ChristmasSnack;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productNum;
        int quantity;
        double total = 0;

        while (true) {
            System.out.print("Enter product number (1-5) or 0 to quit: ");
            productNum = input.nextInt();

            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

            if (productNum == 0) {
                break;
            }

            switch (productNum) {
                case 1:
                    total += 2.98 * quantity;
                    break;
                case 2:
                    total += 4.50 * quantity;
                    break;
                case 3:
                    total += 9.98 * quantity;
                    break;
                case 4:
                    total += 4.49 * quantity;
                    break;
                case 5:
                    total += 6.87 * quantity;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    break;
            }
        }

        System.out.printf("Total retail value of all products sold: $%.2f", total);






//        int productNum;
//        int quantity;
//        double total = 0;
//
//        while (true) {
//            System.out.print("Enter product number (1-5) or 0 to quit: ");
//            productNum = input.nextInt();
//
//            System.out.print("Enter quantity sold: ");
//            quantity = input.nextInt();
//
//            if (productNum == 0) {
//                break;
//            }
//
//            switch (productNum) {
//                case 1:
//                    total += 2.98 * quantity;
//                    break;
//                case 2:
//                    total += 4.50 * quantity;
//                    break;
//                case 3:
//                    total += 9.98 * quantity;
//                    break;
//                case 4:
//                    total += 4.49 * quantity;
//                    break;
//                case 5:
//                    total += 6.87 * quantity;
//                    break;
//                default:
//                    System.out.println("Invalid product number.");
//                    break;
//            }
//        }
//
//        System.out.printf("Total retail value of all products sold: $%.2f", total);
    }
}
