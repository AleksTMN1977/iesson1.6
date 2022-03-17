package ru.skypro;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            sum += arr[i1];
            if (i1 == arr.length - 1) {
                System.out.println("Cумма трат за месяц составила " + sum + " рублей.");
            }
        }
    }

    public static void task2() {

        int[] arr = generateRandomArray();
        int minExp = 150_000;
        int maxExp = 150_000;
        for (int i = 0; i < arr.length; i++) {
            {
                if (arr[i] < minExp) {
                    minExp = arr[i];
                }
            }
            if (arr[i] > maxExp) {
                maxExp = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExp + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExp + " рублей.");
    }

    public static void task3() {

        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i == arr.length - 1) {
                sum = sum / 30;
                System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
            }
        }
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
