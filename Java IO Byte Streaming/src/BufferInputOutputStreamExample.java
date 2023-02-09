import java.io.*;

/**
 * Working of BufferedInputStream
 * The BufferedInputStream maintains an internal buffer(means an array) of 8192 bytes.
 * During the read operation in BufferedInputStream,
 * a chunk of bytes is read from the disk and stored in the internal buffer.
 * And from the internal buffer bytes are read individually.
 * Hence, the number of communication to the disk is reduced.
 * This is why reading bytes is faster using the BufferedInputStream.
 */

public class BufferInputOutputStreamExample {

    public static void main(String[] args) throws IOException {


        InputStream fileInputStream=new FileInputStream(
                "C:\\Java Class Study\\Java-IO-Concept\\Java IO Byte Streaming\\src\\dummyInput.txt");

        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

//        System.out.println(new String(fileInputStream.readAllBytes())); // to print the file in console

        byte[] bytes= bufferedInputStream.readAllBytes();                // to store file in byte[] for,
        System.out.println(new String(bytes));                           //then write it in buffer output stream

        OutputStream fileOutputStream =new FileOutputStream(
                "C:\\Java Class Study\\Java-IO-Concept\\Java IO Byte Streaming\\src\\dummyOutput.txt");

        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(bytes);
    }
}
