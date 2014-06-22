import java.io.*;
import java.util.*;

class Readable{

    public static void main(String[] args){
        String fileName = args[0];
        int designatedId = -1;
        if (args.length==2) designatedId = Integer.parseInt(args[1]);
        try{
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line = "";
            int id = 1;
            while((line = bf.readLine()) != null){
                Recipe recipe = new Recipe(id,line); //register recipe in order
                if (designatedId == -1 || recipe.getId() == designatedId){
                    System.out.println(recipe);  //output the id having designated id(when designated) / output all the recipes(when not designated)
                }
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