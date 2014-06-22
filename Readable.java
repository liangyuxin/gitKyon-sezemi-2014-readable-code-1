import java.io.*;
import java.util.*;

class Readable{

    public static void main(String[] args){
        String fileName = args[0];
        try{
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line = "";
            int id = 1;
            while((line = bf.readLine()) != null){
                Recipe recipe = new Recipe(id,line); //register recipe in order
                System.out.println(recipe);
                id++; //increase id
            }
            bf.close();
        }catch(IOException e){
            System.err.println("READ ERROR: " + fileName);
        }
    }

}

class Recipe{

    private int id;
    private String name;

    public Recipe(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        return id + ": " + name;
    }
    
}