package exercises;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int minSum = 0;
        int maxSum = 0;

        for(int i=0; i < 4; i++){
            minSum += array[i];
        }
        for(int i=1; i < 5; i++){
            maxSum += array[i];
        }
        System.out.println("Your MinimunSum is:" + minSum );
        System.out.println("Your MaximunSum is:" + maxSum);
        System.out.println(  maxSum + " " + minSum );
    }
}
