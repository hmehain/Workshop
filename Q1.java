import java.util.Scanner;
public class Q1 {

	 public static void main(String[] args) {

		    int counter = 0;
		    double even = 0;
		    double odd = 0;
		    double positive = 0;
		    double negative = 0;
		    double sum = 0;
		    int input = 0;
		    double average;

		    System.out.print("Enter a series of values (0 to terminate):");
		     Scanner in = new Scanner(System.in);
 while ((input = in.nextInt()) != 0) {
if (input != 0)
sum = input + sum;
counter++;

		        if (input % 2 == 0)
		            even = even + 1;
		        if (input>0 )
		        	positive = positive +1;
		        if (input<0)
		        	negative = negative +1;
		        else
		            odd = odd + 1;

		        }

		    if (counter > 0) {

		        average = sum / counter;

		        System.out.println("The number of positives is " +positive );
		        System.out.println("The number of negatives is " +negative);
		        System.out.println("Total even numbers entered is " + even);
		        System.out.println("Total odd numbers entered is " + odd);
		        System.out.println("The total is " +sum);
		        System.out.println("The average value is: " + average);
		   
		    }}
		    }

	

