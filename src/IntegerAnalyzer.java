import java.util.Scanner;

public class IntegerAnalyzer {


    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static int countPositive(int[] arr) {
        int count = 0;
        for (int num : arr) if (num > 0) count++;
        return count;
    }

    public static int countNegative(int[] arr) {
        int count = 0;
        for (int num : arr) if (num < 0) count++;
        return count;
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) if (num % 2 == 0) count++;
        return count;
    }

    public static int countOdd(int[] arr) {
        int count = 0;
        for (int num : arr) if (num % 2 != 0) count++;
        return count;
    }


    public static int countGreaterThan(int[] arr, int x) {
        int count = 0;
        for (int num : arr) if (num > x) count++;
        return count;
    }

    public static int countLessThan(int[] arr, int x) {
        int count = 0;
        for (int num : arr) if (num < x) count++;
        return count;
    }

    public static boolean containsValue(int[] arr, int x) {
        for (int num : arr) if (num == x) return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\nNumbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Основні результати
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Positive: " + countPositive(numbers));
        System.out.println("Negative: " + countNegative(numbers));
        System.out.println("Even: " + countEven(numbers));
        System.out.println("Odd: " + countOdd(numbers));

        // Додаткове завдання
        System.out.print("\nEnter X: ");
        int x = scanner.nextInt();

        System.out.println("Greater than " + x + ": " + countGreaterThan(numbers, x));
        System.out.println("Less than " + x + ": " + countLessThan(numbers, x));
        System.out.println("Contains " + x + ": " + (containsValue(numbers, x) ? "yes" : "no"));

        scanner.close();
    }
}