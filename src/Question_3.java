import java.util.Arrays;

public class Question_3 {
//    Given an array, find the sum of max of every subsequence
    public static void main(String[] args) {
        int[] array = {3,2,4,5,6};
        System.out.println("ans : "+sumMaxSubsequenceSum(array));
    }
    static int sumMaxSubsequenceSum(int[] array){
        int sum = 0;
        Arrays.sort(array);
        for(int i=0;i< array.length;i++){
            sum = sum + array[i] * (1<<i);
        }
        return sum;
    }
}
