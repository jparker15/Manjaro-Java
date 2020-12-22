package atsignjar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
                int i = 4;
                double d = 4.0;
                String s = "HackerRank ";

                Scanner scan = new Scanner(System.in);

                /* Declare second integer, double, and String variables. */
                int num;
                double deci;
                String demo;

                /* Read and save an integer, double, and String to your variables.*/
                // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
                num = scan.nextInt();
                deci = scan.nextDouble();
                scan.nextLine();
                demo = scan.nextLine();


                /* Print the sum of both integer variables on a new line. */
                System.out.println(i + num);

                /* Print the sum of the double variables on a new line. */
                System.out.println(d + deci);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

                System.out.println(s + demo);

                scan.close();
    }
}
