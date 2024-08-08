import java.util.ArrayList;
import java.util.Scanner;

public class TShirtBilling {
    public static void main(String[]args) {

        String userID = "kk";
        String password = "ll";
        int numberOfItems, price = 0;
        float VAT = 0.13f, discountPercent, totalAmount = 0;

        ArrayList<Integer> MyArray = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Enter the user ID: ");
            userID = input.nextLine();

            System.out.println("Enter password: ");
            password = input.nextLine();

            if (userID.equalsIgnoreCase("quit")) break;
            if (password.equalsIgnoreCase("quit")) break;

            if (userID.equals(userID) && password.equals(password)) {
                loggedIn = true;
                System.out.println("Successful login.");
            } else {
                System.out.println("Invalid userID and password. Please try again.");
            }
        }

        if (!loggedIn) {
            System.out.println("Closing the system");
            return;
        }

        System.out.println("Enter the number of items:");
        numberOfItems = input.nextInt();

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter the price of the items:" + (i + 1));
            price = input.nextInt();
            totalAmount = totalAmount + price;
        }

        input.nextLine();
        System.out.println("Would you like to apply 13% VAT? (YES/NO): ");
        String VATInput = input.nextLine();
        if (VATInput.equalsIgnoreCase("YES")) {
            totalAmount = totalAmount + (totalAmount * VAT);
        }

        System.out.println("Enter the discount percentage: ");
        discountPercent = input.nextFloat();
        totalAmount = totalAmount - (totalAmount * (discountPercent / 100));

        System.out.println("The total amount is:" + totalAmount);

        System.out.println("Enter your payment amount: ");
        float payment = input.nextFloat();

        float change = 0;
        if (payment > totalAmount) {
            change = payment - totalAmount;
            System.out.println("The change is:" + change);


            if (change >= 1000){
                System.out.println("Highest denomination of change: 1000");
            } else if (change >= 500){
                System.out.println("Highest denomination of change: 500");
            }  else if (change >= 100){
                System.out.println("Highest denomination of change: 100");
            }  else if (change >= 50){
                System.out.println("Highest denomination of change: 50");
            } else if (change >= 20){
                System.out.println("Highest denomination of change: 20");
            } else if (change >= 10){
                System.out.println("Highest denomination of change: 10");
            } else{
                System.out.println("Highest denomination of change: 5");
            }

        } else{
            System.out.println("Not enough payment");
        }

        input.nextLine();

        System.out.println("Type quit or QUIT to exit.");
        String exit = input.nextLine();
        if (exit.equalsIgnoreCase("quit")) {
            System.out.println("Closing the system.");
        }

    }
}
