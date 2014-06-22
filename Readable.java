import java.io.*;
import java.util.*;

class Readable{
    public static void main(String[] args){
		int argNum = 0;
		while (argNum <= args.length) {
			String fileName = args[argNum];
			int designatedId = -1;
			String user = "no usr"; //to avoid NULL_POINT_ECEPTIONEPTION
			//Get ID from user
			if (args.length>=(argNum+1) || args[argNum + 1].length>=10) designatedId = Integer.parseInt(args[1]);           
				if (args[argNum + 2].length <= 10) { //assume it is user name
					user =  args[argNum + 2];
					System.out.println("user name: " + user);
				}else {
					argNum -= 1; //reduce the command of user 
				}
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