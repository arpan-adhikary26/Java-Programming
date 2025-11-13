import java.util.*;
public class SumofDigits{

    public static int Sumofdigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum +=lastDigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter the value of n:");
     int n = sc.nextInt();
     sc.close();
     System.out.println("The sum of digits is:" + Sumofdigits(n));
    }
}
