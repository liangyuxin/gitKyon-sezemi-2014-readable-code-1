import java.io.*;
import java.util.*;

class Readable{

    public static void main(String[] args){
        String fileName = args[0];
        int designatedId = -1;
        
		String user = "no usr"; //to avoid NULL_POINT_ECEPTIONEPTION
		//Get ID from user
        if (args.length==2 || args.length==3) designatedId = Integer.parseInt(args[1]);           
		//Get user name from user
		if (args.length >= 3) {
           	user =  args[2];
           	System.out.println("user name: " + user);
        }
        try{
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line = "";
            String[] arrayToken = new String[2];
            int id = 1;         
            while((line = bf.readLine()) != null){
                arrayToken = line.split(" ");
                Recipe recipe = new Recipe(id,arrayToken[0],arrayToken[1],user); //register recipe in order
                if (designatedId == -1 || recipe.getId() == designatedId){
                    System.out.println(recipe); //output the id having designated id(when designated) / output all the recipes(when not designated)
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
    private String url;
	private String user;
	
    public Recipe(int id, String name, String url, String user){
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
	public String getUser(){
		return user;
	}

    public String getUrl(){
        return url;
    }
    
    public String toString(){
        return id + ": " + name + " " + url;
    }
    
}