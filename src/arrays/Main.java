package arrays;

public class Main {
    static String[] names;
    static int count;

    static String product;
    static int[] days;

    public static void main(String[] args) {

        names = new String[]{"Pen", "Tire", "Dualshok", "Paper",
                "Water", "Kreker", "Nike", "Tire"};

        product = "Nike";

        days = new int[]{1,2,3,4,5,6,7,8};

        for (int i = 0; i < names.length && i < days.length; i++) {
            count++;
            System.out.printf("%d) %d week buy product %s %n",
                    count, days[i], names[i]);

        }

        for (String name : names) {

            if (name.equals(product)) {

                System.out.println("Product is " + name);
            }
        }

        if (count > 0)
            System.out.println("Number of " + product +
                    "'s matches are " + count);

        if (count == 0)
            System.out.println("No data :(");


    }

}