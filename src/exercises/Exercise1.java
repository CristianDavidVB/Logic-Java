package exercises;

public class Exercise1 {
    public static void main(String[] args) {
        int[] signalOne = {1, 2, 3, 3, 3, 5, 4};
        int[] signalTwo = {1, 2, 3, 4, 3, 5, 4};
        System.out.println(updateTimes(signalOne, signalTwo));
    }
    static int updateTimes(int[] signalOne, int[] signalTwo){
        int maxEqueal = 0;
        int time = 0;

        for(int i=0, j=0; i < signalOne.length && j < signalTwo.length; i++, j++){
            if (signalOne[i] == signalTwo[j] && signalOne[i] > maxEqueal) {
                time++;
                maxEqueal = signalOne[i];
            }
        }
        return time;
    }
}
