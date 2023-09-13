public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n > 0) {
            count++;

            // Find out if n is divisible by 2
            boolean divisibleBy2 = n % 2 == 0;

            // Do operations accordingly
            if (divisibleBy2) {
                n = n / 2;
            } else {
                n--;
            }
        }

        System.out.println(count);
    }
}
