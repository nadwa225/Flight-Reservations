import java.util.Scanner;

public class Main {
        protected static Scanner scan = new Scanner(System.in); // scanner that can be used in all
        public static void main(String[] args) {

            System.out.println("******************************************************");
            System.out.println("--------" + "Welcome to Nuux Airline" + "---------");
            System.out.println("******************************************************");


            //Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your first and last name ");
            String name = scan.nextLine();

            System.out.println("Please enter your date of birth " + "in the format of MM/DD/YYYY");
            String date = scan.nextLine();
            Account.validBd(date);

            System.out.println("Please create a password for your account ");
            String pass = scan.nextLine();
            Account.check_Palindrome1(pass);


            System.out.println("\n"+ "Please create a pin number of 4 digits. 0 may not be used in your pin");
            int pin = scan.nextInt();
            Account.setPin(pin);
            //System.out.println("\n");


            Airline.createFlights(); // flight details from the class Airline



            System.out.println("\n" +"Account Holder: " + name);
            System.out.println("Birthdate: " + date);
            System.out.println("Account password: " + pass);
            System.out.println("Account pin #: " + pin + "\n");

            System.out.println("Thank you for booking with NUUX Airlines! " + "\n" + "Have a safe Journey on your flight");
            System.out.print("Your flight has been booked and your flight information is below.");
            System.out.println("Flight Number: " + Airline.flighnum);
            System.out.println("Origin: " + Airline.origin);
            System.out.println("Flight destination: " + Airline.destination);
            System.out.println("Flight departure Time: " + Airline.departureTime);
            System.out.println("Flight return time: "+ Airline.returnTime);
            System.out.println("Flight seat number: " + Airline.seat);


    }
}