/*
    🧮 Program: Calculate nCr (Binomial Coefficient)

    📘 Explanation:
    The binomial coefficient (nCr) is used to determine the number of ways 
    to choose 'r' items from a total of 'n' items, without caring about the order.

    Formula used:
        nCr = n! / (r! * (n - r)!)

    Where:
        n! = n × (n-1) × (n-2) × ... × 1
        r! = r × (r-1) × (r-2) × ... × 1
        (n-r)! = (n-r) × (n-r-1) × ... × 1

    🧠 Example:
        Suppose n = 5 and r = 2
        Then,
        5C2 = 5! / (2! * (5 - 2)!)
             = 120 / (2 * 6)
             = 120 / 12
             = 10

    📍 Steps in this program:
        1. Take input for n and r from user.
        2. Create a user-defined function `fact()` to calculate factorial.
        3. Apply the nCr formula using factorials.
        4. Display the result to the user.

    🧑‍💻 Author: Arpan Adhikary
*/

import java.util.*;
public class BinomialCoefficient{

    public static int Factorial(int num){
        int fact =1;
       for(int i=1; i<=num; i++){
        fact*=i;
       };
       return fact;
    }
    public static int Binomial_Coefficient(int n, int r){
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int n_minus_r_fact = Factorial(n-r);
        int result = n_fact/(r_fact*n_minus_r_fact);
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt(); 
        
        System.out.println("The binomial coeffiecient is: "+ Binomial_Coefficient(n,r));
        sc.close();
    }
}