import java.util.*;
public class avgOfnum{

    public static int Average(int a, int b,int c){

        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valye of a:");
        int a = sc.nextInt();
        System.out.println("Enter the valye of b:");
        int b = sc.nextInt();
        System.out.println("Enter the valye of c:");
        int c = sc.nextInt();

        System.out.println("The average is: "+ Average(a, b, c));
        sc.close();
    }
}