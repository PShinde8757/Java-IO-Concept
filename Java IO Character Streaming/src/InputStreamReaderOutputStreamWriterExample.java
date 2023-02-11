import java.io.*;

public class InputStreamReaderOutputStreamWriterExample {

    public static void main(String[] args) throws IOException {

        FileInputStream fileinputStream=new FileInputStream(
                "C:\\Java Class Study\\Java-IO-Concept\\Java IO Character Streaming\\src\\input.txt");
        InputStreamReader inputStreamReader=new InputStreamReader(fileinputStream);
        char[] chars=new char[50];
        inputStreamReader.read(chars);
        System.out.println(chars);                  //print char array to console

        FileOutputStream fileOutputStream=new FileOutputStream(
                "C:\\Java Class Study\\Java-IO-Concept\\Java IO Character Streaming\\src\\output.txt");

        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write(chars);




    }
}
