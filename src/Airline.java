import java.util.Scanner;

/**
 * This class main goal is to keep details of the flight and let the user create their own flight reservations
 * Main purpose is to let the user have fun and create any flight to anywhere
 */
public class Airline {

    static int flighnum;
    static double price;
    static String destination;
    static String origin, returnTime, departureTime, seat;

    Airline(double price, String o, String des, String dt, String rt, String seat, int num)
    {
        // makes sure the destination and origin are not the same
        // figure out how to throw exception
        if (des.equals(o))
        {
            System.out.println("Destination and origin of flight are the same, try somewhere else");
        }
        flighnum = num ; // creates the flight num
        departureTime = dt; //
        destination = des;
        origin = o; // starting point of the flight
        Airline.price = price;
        returnTime = rt;
        Airline.seat = seat;
    }


    // create the flights, let the user create their own flight
    public static void createFlights()
    {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("enter flight number");
        flighnum = scan.nextInt();

        System.out.println("Enter flight origin");
        origin = scan1.nextLine(); // it keeps skipping

        System.out.println("Enter flight destination");
        destination = scan1.nextLine();

        System.out.println("Enter flight time ");
        departureTime = scan1.nextLine();

        System.out.println("Enter the ticket price");
        price = scan2.nextDouble();

        System.out.println("Flight return time");
        returnTime = scan1.nextLine();

        System.out.println("Select seat");
        seat = scan1.nextLine();



    }


}
