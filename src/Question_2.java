public class Question_2 {
//    Given n elements, find sum of subset sum
    public static void main(String[] args) {
        int[] array = {3,1,4};
        System.out.println("ans : "+sumSubsetSum(array));
    }
    static int sumSubsetSum(int[] array){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            sum = sum + array[i] * (1<< array.length-1);
        }
        return sum;
    }
}
