public class reverseArray {
    public static int reverseArrayIt(int number[]){
        int start = 0, end=number.length-1;

        while (start<end) {
            int temp =number[end];
            number[end]=number[start];
            number[start]=temp;

            start++;
            end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {22,2,4,6,8,10,12,14};
        
        reverseArrayIt(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]+"");
        }
        System.out.println();
    }
}
