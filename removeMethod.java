import java.util.*;

public class removeMethod{
    public static void main(String[] args){

        try {
            ArrayList<Integer> myArrayList = new ArrayList<Integer>();

            ArrayList<Integer> myNewArrayList = null;


            for (int i = 0; i < 10; i++) {
                myArrayList.add((i + 1) * 2);
            }


            System.out.println("ArrayList 1 : " + myArrayList);
            System.out.println("ArrayList 2 : " + myNewArrayList);

            
            myArrayList.addAll(myNewArrayList);

            System.out.println("ArrayList 1 with Collection of ArrayList 2 : " + myArrayList);

            
            myArrayList.removeAll(myNewArrayList);

            System.out.println("ArrayList 1 after removing collection of ArrayList 2 : " + myArrayList);

        }
        catch (NullPointerException e){
            System.out.println("Exception is : " + e);
        }


    }
}
