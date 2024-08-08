import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> MyArray = new ArrayList<Integer>();
        MyArray.add(1);
        MyArray.add(27);
        MyArray.add(3);
        MyArray.set(2,9);
        MyArray.remove(1);
        for (Integer i : MyArray) {
            System.out.println(i);
        }
    }
}