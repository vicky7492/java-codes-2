import java.util.*;

public class listIteratorMethod {
   public static void main(String[] args) {
      List<String> aList = new ArrayList<String>();
      aList.add("Vicky");
      aList.add("Arun");
      aList.add("Lucky");
      aList.add("Hello world");
      aList.add("No");
      Iterator i = aList.iterator();
      System.out.println("The ArrayList elements are:");
      while (i.hasNext()) {
         System.out.println(i.next());
      }
         
        
   }
}