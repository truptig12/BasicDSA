public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(12335));
    }

    private static int count(int n) {
        int count = 0;
      while(n > 0){
          n = n/10;
          count++;
      }
      return count;
    }
}
