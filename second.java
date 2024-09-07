import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("length of array: "+ marks.length);
       
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        

        // //update data
        // marks[2]= 99;
        // System.out.println("Chem : " + marks[2]);

        // //add sub mul div using this method sign changes data
        // marks[2]= marks[2] + 1;
        // System.out.println("Chem : " + marks[2]);

        //percentage
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage ="+ percentage + "%");

    }
}