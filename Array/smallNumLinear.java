public class smallNumLinear {
    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-INFINITE
        int smallest = Integer.MAX_VALUE; //-INFINITE

        for(int i=0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
            if (smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,0,2,6,3,5};
        System.out.println("largest value is : " +findLargest(number));
    }
}
