public class Question_1 {
//    Given N distinct elements, check if there exists a subset with sum = k
    public static void main(String[] args) {
        int[] array={3,-1,0,6,2,-3,5};
        int k=  10;
        System.out.println("ans : "+isSumK(array,k));
    }
    static boolean isSumK(int[] array, int k){
        for(int i=0;i<1<< array.length;i++){
            int sum = 0;
            for(int j=0;j< array.length;j++) {
                if (checkBit(i, j)){
                    sum = sum + array[j];
                }
            }
            if(sum == k){
                return true;
            }
        }
        return false;
    }
    static boolean checkBit(int i, int j){
        if(((i>>j)&1)==1){
            return true;
        }
        return false;
    }
}
