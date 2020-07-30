package mogaka;
import java.io.IOException;

public class AptitudeTest2 {
    public static void main(String[] args) {
        try {
            int score;
            System.out.println("Enter your aptitude test score: ");
            //get Integer may throw IOException or NumberFormatException
            score = TestException.getInteger();
            if (score > 50) {
                System.out.println("You have a place in this course.");
            }else
            {
                System.out.println("Sorry, you failed the test!");
            }
        }
        //if something is wrong
        catch (NumberFormatException e ) {
            System.out.println("You entered an invalid number!!");
        }
        catch (IOException e) {
            System.out.println(e);//calls toString method
        }
        //even if no exception thrown/caught this line will be executed
        System.out.println("Goodbye!");
    }
}
