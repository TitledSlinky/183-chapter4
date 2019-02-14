//Francisco Barajas
//Chapter 4 - use control structures to determine the two largest
//numbers input by the user.
import java.util.Scanner;

public class Largest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      int largest1 = Integer.MIN_VALUE;
      int largest2 = Integer.MIN_VALUE;
      int number = 0;
      int counter = 0;
      
      System.out.println( "Enter numbers, one per line, 0 on the last line to end:" );
      do
      {
         number = input.nextInt();  
         if ( number >= largest1 )                         //checking to see if there is a bigger number.
         {
            largest2 = largest1;
            largest1 = number;
         }
         if ( number < largest1 && number >= largest2 )   //checking to see if there is a number smaller than the biggest number, but bigger than the second biggest.
            largest2 = number;
         counter++;
      }  while ( number != 0 );
      if ( counter == 1 )                                //making sure if you exit the program without any data, it doesn't give you data you haven't entered as a result.
         System.out.println("No data was found.");
      else if ( counter == 2 )                           //making sure if you exit the program with only entering one number, you only get one result back.
         System.out.printf("The Largest number is %d.", largest2);
      else
         System.out.printf("The largest two numbers are %d and %d.", largest1, largest2);
   }
}
