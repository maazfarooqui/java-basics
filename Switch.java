import java.util.Scanner;

public class Switch {
    public static void main(String args[])
    {
        String days;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the day");
        days = sc.next();
        switch (days) {
            case "Monday":
            case "Tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            case "monday":
            case "tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

                    System.out.println("today is working day");
                break;
            

            case "Saturday":
            case "Sunday":
            case "saturday":
            case "sunday":

            System.out.println("today you can relax");
            break;
        
            default:
            System.out.println("Invalid input");
                break;


                
        }

        sc.close();
    }
}
