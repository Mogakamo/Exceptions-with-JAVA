package mogaka;

import java.io.IOException;

public class TestException {
    //this method declares 'static' as it is a class method
    public static int getInteger() throws IOException {
        //code for method goes here
    byte [] buffer = new byte[512];//declares a large byte array
        System.in.read(buffer);//characters entered stored in array
        String s = new String(buffer);//make string from byte array
        s = s.trim();//trim string
        int num = Integer.parseInt(s);//Converts string to an 'int'
        return num;//sends back an integer value
    }
}
