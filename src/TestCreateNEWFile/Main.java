package TestCreateNEWFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //FileOutputStream out = new FileOutputStream("c://Temp//testFile2.txt");

        File file = new File("c://temp//testFile1.txt");
        if (file.createNewFile())
        {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }



    }
}
