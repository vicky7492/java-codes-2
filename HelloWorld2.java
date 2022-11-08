import java.io.*;  
  
public class HelloWorld2 {   
  
     
    public static void method() throws FileNotFoundException {  
  
        FileReader file = new FileReader("C:\\Users\\ArunSingh");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        throw new FileNotFoundException();  
      
    }  
     
    public static void main(String args[]){  
        try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
} 