import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        int rev = 0;

        while(num>0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if(rev == x){
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not Palindrome number");
        }

    }
}
