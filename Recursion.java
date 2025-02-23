public class Recursion {
    public static int factorial(int n) {
        if (n == 0)
            return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static long fact(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;

    }

    public static void main(String[] args) {
        int result = factorial(5);
        long result2 = fact(5);
        System.out.println("Factorial of 5: " + result);
        System.out.println("Factorial of 5 " + result2);
    }
}
