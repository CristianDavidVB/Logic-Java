package exercises;

public class exercise2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print(sum(array));
    }

    static int sum(int[] array) {
        int minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += array[i];
        }
        int maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += array[i];
        }
        System.out.println(minSum + " " + maxSum);
        return minSum;
    }
}
