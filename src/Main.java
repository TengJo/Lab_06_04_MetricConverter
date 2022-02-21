import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	double meters = 0;
    String trashMeters;
    double miles;
    double feet;
    double inches;
    Scanner in = new Scanner(System.in);

        System.out.print("What is the measurement in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
        }
        else
        {
            trashMeters = in.nextLine();
            System.out.println("You have input an incorrect value: " + trashMeters);
            System.exit(0);
        }
        miles = meters / 1609.344;
        feet = meters * 3.281;
        inches = meters * 39.37;
        System.out.printf("The measurement in miles is %4.2f, the measurement in feet is %4.2f, and the measurement in inches is %4.2f.",miles , feet, inches);
    }
}
