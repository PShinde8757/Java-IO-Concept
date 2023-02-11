import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String s ="Hello from String";

        StringReader stringReader=new StringReader(s);
        char[] ch =new char[20];

        stringReader.read(ch);
        System.out.println(ch);

        StringWriter stringWriter = new StringWriter();
        String writtenString = "";
        stringWriter.write(writtenString);
        System.out.println("Written String "+writtenString);

    }
}