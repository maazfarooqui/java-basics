import java.util.Scanner;

public class Calculator{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle amount");
        Long p = sc.nextLong();
        int r = 10;
        float t;
        System.out.println("enter time period for which you want to invest");
        t = sc.nextFloat();

        double x = 123.0;

        System.out.println("your Simple interest at the end of period will be: " + (p*t*r)/100);


    }
}