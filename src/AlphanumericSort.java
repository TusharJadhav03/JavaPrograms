import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphanumericSort {

    public static void main(String[] args) {

        String value = "ASI10B5154";

        List<Character> alphabets = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        for(int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isLetter(c)) {
                alphabets.add(c);
            } else if (Character.isDigit(c)) {
                numbers.add(c);
            }
        }

        Collections.sort(alphabets);
        Collections.sort(numbers);

        StringBuilder sortedResult = new StringBuilder();

        for (char c : alphabets) {
            sortedResult.append(c);
        }

        for (char c : numbers) {
            sortedResult.append(c);
        }

        System.out.println("Sorted alphabets and numbers: " + sortedResult.toString());
    }
}
