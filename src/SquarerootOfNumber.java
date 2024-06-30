import java.util.Scanner;

public class SquarerootOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double number = sc.nextDouble();
        double squareRoot = Math.sqrt(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);
    }
}
