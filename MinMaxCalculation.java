import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};

        int min = Arrays.stream(numbers).min().orElseThrow();
        int max = Arrays.stream(numbers).max().orElseThrow();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}