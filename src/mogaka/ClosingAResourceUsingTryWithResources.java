package mogaka;

import java.util.Scanner;

public class ClosingAResourceUsingTryWithResources {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in))//opens a scanner resource
        {
            System.out.println("START TRY");
            String[] colours = {"RED", "BLUE", "GREEN"};
            System.out.println("Which colour? (1,2,3): ");
            String pos = keyboard.next();
            //throws NumberFormatException
            int i = Integer.parseInt(pos);
            //throws ArrayIndexOutOfBoundException
            System.out.println(colours[i-1]);
            System.out.println("END TRY");
        }
        //catch only for ArrayIndexOutOfBoundException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ENTER CATCH");
            System.out.println(e);
        }
        //removed the finally clause
        System.out.println("Goodbye!!");
    }
}
