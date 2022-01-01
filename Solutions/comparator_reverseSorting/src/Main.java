import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Implement a method that takes a List<String> and sorts it in reverse lexicographic order. You don't need to read or write anything from or to the console, just implement the method.
 * Sample Input 1:
 * apple grape pear banana pineapple
 * Sample Output 1:
 * pineapple pear grape banana apple
 * Sample Input 2:
 * Cap cape cup cake Cook
 * Sample Output 2:
 * cup cape cake Cook Cap
 * */
public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<> (List.of("apple", "grape", "pear", "banana", "pineapple"));
        System.out.println(fruits);
        Utils.sortStrings(fruits);
        System.out.println(fruits);

    }
}

class Utils {

    public static void sortStrings(List<String> strings) {
        // your code here
        strings.sort(Comparator.reverseOrder());
    }
}
