import java.io.*;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {

        byte[] bytes= {'h','e','l','l','o'};
        /*System.out.println(new String (bytes));*/

        InputStream inputStream=new ByteArrayInputStream(bytes);

        OutputStream outputStream=new ByteArrayOutputStream();
        outputStream.write(inputStream.readAllBytes());
        System.out.println(outputStream);


    }
}