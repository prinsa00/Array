import java.util.Arrays;
import java.util.Scanner;

public class ItemsArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of items");
        int number = input.nextInt();
        int[] item = new int[number];

        for(int i = 0; i < number; i++){
            System.out.println("Enter value");
            int value = input.nextInt();
            item[i] = value;
        }

    }
}
