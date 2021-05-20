package ByteTest;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        byte myByte = 12;
        byte[] myArray = {myByte};
        //System.out.println("myArray: " + myArray.toString());
        InputStream in = new ByteArrayInputStream(myArray);

        int myInt = in.read();
        System.out.println(myInt);

    }
}
