class Readable{

    public static void main(String[] args){
        String fileName = args[0];
        try{
            BufferedReader bf = new BufferedReader(new FileReader("fileName"));
            String line = "";
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("READ ERROR: " + fileName);
        }
    }

}