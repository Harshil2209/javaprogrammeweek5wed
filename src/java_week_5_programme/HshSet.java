package java_week_5_programme;

import java.util.HashSet;

/**
 * Use HashSet that stores Integer Objects.Store the number 4,7,and 8 to Sets.
 * Show which numbers are between 1 and 10 are in the set.
 */

public class HshSet {
    public static void main(String[] args) {
        //Create a HashSet objects called numbers
        HashSet<Integer> numbers = new HashSet<>();

        //Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is found in the set.");
            } else {
                System.out.println(i + " is not found in the set.");
            }
        }
    }
}
