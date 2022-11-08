


import java.util.*;

public class listIterator2 {
    public static void main(String[] args){

        try {
            ArrayList<String> myArrayList = new ArrayList<String>(5);

            myArrayList.add("Vicky");
            myArrayList.add("Arun");
            myArrayList.add("Helloworld");
            myArrayList.add("India");
            myArrayList.add("Hi");

            System.out.println(myArrayList);

            ListIterator<String> it = myArrayList.listIterator(6);
            System.out.println("List after Iterating : ");
            while (it.hasNext()) {
                System.out.print(it.next() + "\t");
            }
        }
        catch (IndexOutOfBoundsException i){
            System.out.println(i);
        }

    }
}
