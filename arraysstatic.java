import java.util.*;
public class arraysstatic{
    public static void main(String args[])
    {
        //initialisation of array 
        int arr[]={22,44,565,789,200};
        System.out.println(Arrays.toString(arr));
        //Accesing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modification of array
        arr[2]=456;
        arr[3]=345;
        System.out.println(Arrays.toString(arr));
    }
}