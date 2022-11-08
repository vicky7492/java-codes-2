package p2;
import java.io.*;


public class ExcepExample{
public static void one()throws FileNotFoundException
{
 FileReader file=new FileReader("C:/Users/Dell/Documents/D.mp4");
 BufferedReader fileinput=new BufferedReader(file);
 
 throw new FileNotFoundException();
}
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  try {
   one();
  }
  catch(FileNotFoundException e) {
   System.out.println("hgguiguihuihuihuihuh");
  }
  System.out.println("rest");
 }

}
