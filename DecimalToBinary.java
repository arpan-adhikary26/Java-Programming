import java.util.*;
public class DecimalToBinary{

    public static void dectobin(int n){
        int num = n;
        int binary = 0;
        int pow = 0;
        while(n>0){
            int remainder = n%2;
            binary = binary + (remainder*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary of " + num + " is " + binary);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        dectobin(n);
        sc.close();
    }
}