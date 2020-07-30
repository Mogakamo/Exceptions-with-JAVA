package mogaka;
import java.io.IOException;

public class AptitudeTest {
    public static void main(String[] args) throws IOException {
        int score;
        System.out.println("Enter your aptitude test score: ");
        score = TestException.getInteger();//Calling class method
        //test score goes here
    if (score > 50) {
        System.out.println("You have a place in this course!");
    }
    else {
        System.out.println("Sorry, you failed your test!");
    }
   }
}
