public class PalindromeString {

    public static void main(String[] args) {

        String s = "MADAM";

        int i = 0;
        int j = s.length()-1;
        int flag = 0;

        while(i<j && flag ==0){
            if(s.charAt(i)!=s.charAt(j)) {
                flag = 1;
            }
            i++;
            j--;
        }

        if(flag==0){
            System.out.println("String palindrome");
        }
        else {
            System.out.println("String Not Palindrome");
        }
    }
}
