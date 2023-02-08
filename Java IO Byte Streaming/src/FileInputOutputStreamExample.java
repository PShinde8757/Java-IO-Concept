import java.io.*;

public class FileInputOutputStreamExample {

    public static void main(String[] args) throws IOException {

        InputStream inputStream=new FileInputStream(
                "C:\\Users\\prati\\Java-IO-Concept\\Java IO Byte Streaming\\src\\input.txt");

//        System.out.println(new String(inputStream.readAllBytes()));   // to print on console

        OutputStream outputStream=new FileOutputStream(
                "C:\\Users\\prati\\Java-IO-Concept\\Java IO Byte Streaming\\src\\output.txt");


        outputStream.write(inputStream.readAllBytes());     //read & write all bytes from input.txt

        inputStream.close();
        outputStream.close();


    }
}
