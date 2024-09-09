//find the largest number in a given array :  1,2,6,3,5

public class largeNum {
    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-INFINITE

        for(int i=0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("largest value is : " +findLargest(number));
    }
}
