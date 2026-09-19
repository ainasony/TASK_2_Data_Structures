import java.util.Scanner;

public class TASK_2 {

    // Method to sort the array
    // Bubble Sort is used to sort the array
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to find second highest and second lowest
    // Find second highest and second lowest values
    public static void findSecondValues(int[] arr) {

        int lowest = arr[0];
        int secondLowest = arr[1];

        int highest = arr[0];
        int secondHighest = arr[1];

        if (lowest > secondLowest) {
            int temp = lowest;
            lowest = secondLowest;
            secondLowest = temp;
        }

        if (highest < secondHighest) {
            int temp = highest;
            highest = secondHighest;
            secondHighest = temp;
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] < lowest) {
                secondLowest = lowest;
                lowest = arr[i];
            } else if (arr[i] < secondLowest && arr[i] != lowest) {
                secondLowest = arr[i];
            }

            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        System.out.println("Second Lowest : " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sortArray(numbers);

        System.out.println("\nSorted Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        findSecondValues(numbers);

        sc.close();
    }
}