package codegym;

import java.util.Scanner;

public class BinarySearchAlex {
    public static void main(String[] args) {
        int counter, num, item, array[], first, last, middle;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        num = input.nextInt();
        array = new int[num];

        System.out.println("Enter " + num + " integers");

        for (counter = 0; counter < num ; counter++) {
            array[counter] = input.nextInt();
        }

        System.out.print("Enter the search value: ");

        item = input.nextInt();
        first = 0;
        last = num - 1;
        middle = (first + last)/2;

        while (first <= last) {
            if (array[middle] < item) {
                first = middle + 1;
            } else if (array[middle] ==  item) {
                System.out.print(item + " founr ad location " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if (first > last) {
            System.out.print(item + " is not found.\n");
        }
    }
}
