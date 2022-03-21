package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        task6();

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
        int minExp = arr[0];
        int maxExp = arr[0];
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
        }
        sum = (double) sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void task5() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[] arr = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        int arr1[] = new int[5];
        for (int j = arr.length; j == 0; j--) {
            arr1 = j;
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




