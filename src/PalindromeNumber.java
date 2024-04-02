public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 4553;

        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int numb) {
        int temp =numb;
        int rev =0;
        while(temp > 0){
            int ld = temp % 10;
            rev = rev*10+ld;
            temp = temp/10;
        }

        return rev == numb;
    }
}
