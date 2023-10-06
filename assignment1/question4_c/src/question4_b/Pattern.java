package question4_b;

public class Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Inner loop for printing '*' based on the current row number
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}