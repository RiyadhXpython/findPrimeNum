public class primeFinding {
    public static void main(String[] args) {
        findPrimeNum (5, 50);
    }

    public static void findPrimeNum (int lowLimit, int hiLimit) {
        for (int num = lowLimit; num <= hiLimit; num++) {
            if (isPrime(num)) {
                System.out.println(num + " ");
            }
        }
    }

    public static boolean isPrime (int num) {
        if (num < 2) return false;
        for (int divisor = 2; divisor * divisor  <= num; divisor ++) {
            if (num % divisor == 0) return false;
        }
        return true;
    }
}
