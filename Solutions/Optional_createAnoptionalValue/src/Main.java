import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

/**
 * Implement the method getValue of the InputStringReader class. It should read a String value from the console and construct Optional<String> object based on the value. If an input String equals empty, then create an empty Optional.
 *
 * Use java.util.Scanner to read input data.
 *
 * Sample Input 1:
 * abcd
 *
 * Sample Output 1:
 * Value is present: abcd
 *
 * Sample Input 2:
 * empty
 *
 * Sample Output 2:
 * Value is empty
 */

public class Main {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();
        Optional<String> value = reader.getValue();
        if (value.isPresent()) {
            System.out.println("Value is present: " + value.get());
        } else {
            System.out.println("Value is empty");
        }
    }
}

class InputStringReader {
    public Optional<String> getValue() {
        // implement
        String value = new Scanner(System.in).nextLine();
        return !Objects.equals(value, "empty") ? Optional.ofNullable(value) : Optional.empty();
    }
}
