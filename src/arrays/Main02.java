package arrays;

import java.util.Scanner;
public class Main02 {
    static String[] names;
    static int count;
    static int count2;
    static String product;
    static int[] days;

    public static void main(String[] args) {

        names = new String[]{"Pen", "Tire", "Dualshok", "Paper",
                "Water", "Kreker", "Nike", "Tire"};

        days = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < names.length && i < days.length; i++) {
            count++;


            System.out.printf("%d) %d week product %s %n",
                    count, days[i], names[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string product: ");

        String names = scanner.nextLine();{

            if (names.equals(product))
                count2++;

            System.out.println("Product is " + names);


            if (count == 0)
                System.out.println("No data :(");

        }

    }

}
