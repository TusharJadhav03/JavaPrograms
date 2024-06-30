import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+ " " + b+" ");
        int c =0;

        for(int i=3;i<=num;i++){

            c = a + b ;
            a = b;
            b = c;

            System.out.print(c+ " ");
            sc.close();
        }
    }
}
