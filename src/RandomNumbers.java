import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {
    public static void main(String[] args) {

        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            digits.add(i);
        }

        Collections.shuffle(digits);

//        while (digits.get(0) == 0) {
//            Collections.shuffle(digits);
//        }

        int randomNumber = 0;
        for (int i = 0; i < 4; i++) {
            randomNumber = randomNumber * 10 + digits.get(i);
        }

        System.out.println("Random 4-digit number with unique digits: " + randomNumber);
    }
}
