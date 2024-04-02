public class Exactly3Divisors {
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(10));
    }

    public static int exactly3Divisors(int N) {
        int count = 0;
        for (int i = 2; i * i <= N; i++) {
            if (isPrimeN(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrimeN(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
