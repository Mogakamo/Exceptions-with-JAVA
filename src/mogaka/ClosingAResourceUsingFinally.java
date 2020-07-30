package mogaka;

import java.util.Scanner;

public class ClosingAResourceUsingFinally {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("START TRY");
            String[] colours = {"RED", "BLUE", "GREEN"};//initialising the array
            System.out.println("Which color? (1,2,3): ");
            String pos = keyboard.next();
            //throws NumberFormatException
            int i = Integer.parseInt(pos);
            //throws ArrayIndexOutOfBoundException
            System.out.println(colours[i-1]);
            System.out.println("END TRY");
        }
        //includes a catch only for ArrayIndexOutOfBoundException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ENTER CATCH ");
            System.out.println(e);
        }
        //will always be executed
        finally {
            System.out.println("ENTER FINALLY");
            keyboard.close();//scanner resource closed
            System.out.println("Scanner CLOSED");
        }
    }
}
