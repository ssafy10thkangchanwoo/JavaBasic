import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ConsoleIO {
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        InputStreamReader r1eader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);


        char[] arr = new char[3];
        //reader.read(arr);
        System.out.println(arr);

        int a;
//        int b;
//        int c;
        byte[] by = new byte[3];
        in.read(by);

       a = in.read();
//        b = in.read();//
//        c = in.read();
       System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        System.out.println(by[0]);
        System.out.println(by[1]);
        System.out.println(by[2]);

        String str = br.readLine();
        System.out.println(str);
    }
}
