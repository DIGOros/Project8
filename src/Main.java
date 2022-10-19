import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int n = 9;



        System.out.println("Part 1.1");
        printNumbers(n);


        System.out.println();
        System.out.println("Part 1.2");
        printNumbersBackwards(9);


        System.out.println();
        System.out.println("Part 3");
        int[] array = random.ints(10, 0, 100).toArray();
        int[] array2 = random.ints(10, 0, 5).toArray();
        System.out.println("Array: " + Arrays.toString(array));
        int sum = sum(array, array.length - 1);
        System.out.println("Sum: " + sum);


        System.out.println("Array for part 2.3: " + Arrays.toString(array2));


        int what = 2;
        int findCountInArray = findCountInArray(array2, 2, array2.length - 1);
        int counter = 0;
        for (int element : array2) {
            if (element == what ) {
                counter++;
            }
        }
        System.out.println("Number "+ what + " appears " + counter + " times");


    }


    // Task 1
    public static void printNumbers(int number) {
        if (number < 1) return; // base case

        System.out.print(number);
        printNumbers(number - 1); // recursive case

    }

    // Task 1
    public static void printNumbersBackwards(int i) {
        if (i >= 1) {
            printNumbersBackwards(i - 1);
            System.out.print(i);
        }
    }


    // Task 2
    public static int sum(int[] array, int n) {
        if (n < 1) return array[n];
        return array[n] + sum(array, n - 1);

    }

    public static int findCountInArray(int[] array, int what, int i) {
        if (i > 1) return  array[i];
        return array[i] + findCountInArray(array, 0, i = 0);

    }
}



