import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;

/**
 * Najma Ismail
 * 10/21/2022
 * CSC 1120
 * I have neither given nor received help I was not supposed to
 * This program uses Stack data structure as well as other features to create flights.
 * It tests whether the password of the user is a palindrome or not.
 * User inputs their personal info including name, password, pin and birthdate.
 * they also input their flight info resulting of all their info printed at the end of the program.
 *
 */
public class Account {
    String name;
    static String password;
    static String birthdate; // account holder name, password being checked for the palindrome, 4 digit pin
    static int pin; // 4 digit pin-number created by account holder


    // constructor Account
    Account(String name, String pass, String bd, int pin)
    {
        birthdate = bd;
        password = pass;
        this.name = name;
        Account.pin = pin;
    }

    // check to see if the user entered a valid birthdate in correct order
    public static void validBd(String enterdate) {
        SimpleDateFormat date = new SimpleDateFormat("MM/ddd/yyyy"); // creates this pattern to be the format
        date.setLenient(false);
        boolean valid = false; // checks if user input is valid

        while (!valid) {

            try {
                date.parse(enterdate);
                Date y = date.parse(enterdate); // becomes a date object
                valid = true;
                 birthdate = enterdate; // set the date entered to birthdate
            }
            catch (Exception e) {
               System.out.println("Invalid birthdate");
               System.out.print("Please try to reenter the birthdate in the correct format(MM/DD/YYYY)");

                validBd("\n" + Main.scan.nextLine() ); // recursively asks for the method again
                return;
            }
        }
    }

    // this method sets the pin and checks to see if pin in 4 digits
    public static void setPin(Integer p) {

        // why does it have to be an
        // if letters are entered it crashes
       if (p.toString().length() == 4) { // ifd the pin = 4 digits then set it to pin
            try {
                pin = p;
            //Integer p1 = Integer.parseInt(String.valueOf(p));
            }
              catch(Exception e){
               System.out.println("You have inputted an invalid pin.");
                setPin(Main.scan.nextInt());
            }
        }
    }

    // this method checks the users password and determines whether it is a palindrome or not
    public static void check_Palindrome1(String pass)
    {

        Stack<Character> stack = new Stack<>();
        // Checks if it is a palindrome

        for (int i = 0; i < pass.length(); i++) {
            stack.push(pass.charAt(i));
        }

        String reverse = "";

        // pop all the characters each by starting from the back
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        // check to see if the original and reverse are same and display answer
        if (pass.equals(reverse))
            System.out.println("This password is a palindrome");
        else
            System.out.println("This password is not a palindrome");
    }


}
