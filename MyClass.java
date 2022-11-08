public class MyClass {
    public static void main(String[] args){
        int[] myArray = new int[5];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
        myArray[4]=5;

        try {
            System.out.println(myArray[5]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception is : " + e);
        }
    }
}
