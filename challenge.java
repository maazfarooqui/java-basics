import java.util.Scanner;

public class challenge {
    public static void main (String args[])
    {
        System.out.println("enter your pattern length");
        Scanner scan = new Scanner(System.in);

        int x = 5;

        for(int i=0; i<x; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        scan.close();

    }
}
