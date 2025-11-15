package Arrays;
import java.util.*;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];

        // Insertion in Array
        System.out.println("Enter the marks:");

        System.out.print("Marks for Physics: ");
        marks[0] = sc.nextInt();

        System.out.print("Marks for Chemistry: ");
        marks[1] = sc.nextInt();

        System.out.print("Marks for Maths: ");
        marks[2] = sc.nextInt();

        // Output in Array
        System.out.println("\nYou Entered:");
        System.out.println("Physics = " + marks[0] + 
                           ", Chemistry = " + marks[1] + 
                           ", Maths = " + marks[2]);

        // Updation in Array
        System.out.println("\nEnter the updated marks:");

        System.out.print("Updated Physics: ");
        marks[0] = sc.nextInt();

        System.out.print("Updated Chemistry: ");
        marks[1] = sc.nextInt();

        System.out.print("Updated Maths: ");
        marks[2] = sc.nextInt();

        // Output updated array
        System.out.println("\nUpdated Marks:");
        System.out.println("Physics = " + marks[0] + 
                           ", Chemistry = " + marks[1] + 
                           ", Maths = " + marks[2]);

        sc.close();
    }
}
