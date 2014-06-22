import java.io.*;
import java.util.*;

class Readable{

    public static void main(String[] args){
        String fileName = args[0];
        try{
            BufferedReader bf = new BufferedReader(new FileReader("fileName"));
            System.out.println(bf.readLine());
            bf.close();
        }catch(IOException e){
            System.err.println("READ ERROR: " + fileName);
        }
    }

}