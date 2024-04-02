public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(19));
    }


    public static int digitsInFactorial(int N) {
        // code here
        if(N<2){
            return 1;
        }
        int digitCount =0;
        for(int i =2; i<=N; i++){
            digitCount += (int) Math.log10(i);
        }

        return (int) (Math.floor(digitCount)+1);
    }
}
