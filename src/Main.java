// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] weights = {12, 23, 43, 34, 232, 4};
        int[] weightsCopy = {12, 23, 43, 34, 232, 4};
        if (weights == weightsCopy) {
            System.out.println("Массивы одинаковы");
        } else {
            System.out.println("Массивы не одинаковы");
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
        }
    }
}