package Counter;

import java.util.Scanner;

public class counter {
    public static void main (String args[] ){
        int rows, number = 1, counter, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");

        rows = input.nextInt();
        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for ( counter = 1 ; counter <= rows ; counter++ )
        {
            for ( j = 1 ; j <= counter ; j++ )
            {
                System.out.print(number+" ");

                number++;
            }

            System.out.println();
        }
    }
}
