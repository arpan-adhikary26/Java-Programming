/*
    💡 Program: Convert Binary Number to Decimal

    📘 Explanation:
    - A binary number is made of digits 0 and 1.
    - Each digit represents a power of 2, starting from right to left.

    🧮 Formula:
        decimal = (binary_digit * 2^position) + ...

    🧠 Example:
        Binary: 1011
        Decimal = (1×2³) + (0×2²) + (1×2¹) + (1×2⁰)
                = 8 + 0 + 2 + 1
                = 11

    📍 Steps:
        1️⃣ Take a binary number as input.
        2️⃣ Extract each digit from right to left.
        3️⃣ Multiply each digit by 2^position and add to sum.
        4️⃣ Print the decimal result.

    👨‍💻 Author: Arpan Adhikary
*/

import java.util.*;
public class BinaryToDecimal{

    public static void BinToDec(int n){
        int pow=0;
        int decimal = 0;
        int num =n;

        while(n>0){
            int lastDigit = n%10;
            decimal = decimal+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
       
        System.out.println("Decimal of " + num + " is: " + decimal);

        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        BinToDec(n);
        sc.close();
    }
}