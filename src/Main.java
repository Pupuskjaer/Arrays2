import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void task1(){
        int[] array = generateRandomArray();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2(){
        int[] array = generateRandomArray();
        boolean greater, lower;
        int minAmount = 0;
        int maxAmount = 0;
        for (int i = 0; i < array.length; i++) {
            greater = array[i] > maxAmount;
            if (greater) {
                 maxAmount = array[i];
            }
        }
        System.out.println("Максимальная трата за месяц составила " + maxAmount + " рублей");

        for (int i = 0; i < array.length; i++) {
            if (minAmount == 0) {
                minAmount = array [i];
            }
            lower = array[i] < minAmount;
            if (lower) {
                  minAmount = array[i];
            }
        }
        System.out.println("Минимальная трата за месяц составила "  + minAmount + " рублей");
    }
    public static void task3(){
        int[] array = generateRandomArray();
        int avarage = array[0];
        for (int i = 1; i < array.length; i++) {
            avarage = (avarage + array[i])/2 ;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avarage + " рублей");
    }
    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char symbol;
        for (int i = 0; i < reverseFullName.length/2; i++) {
            symbol = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName [reverseFullName.length - i - 1] = symbol;
        }
        System.out.print(reverseFullName);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }



}