public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50}; //direct initialisation

        System.out.println(arr);
        System.out.println(arr[0]);

        int[] arr2 = new int [5]; //new is used for dynamic memory allocation, 
        // if you want to just reserve memory for your array, use this syntax

        // later if you want to define it....
        arr2[0]=10;
        arr2[1]=20;
        System.out.println(arr2);
        System.out.println(arr2[1]);



    }
}
