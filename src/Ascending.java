import java.util.Arrays;

public class Ascending {
    //defining an array of integer type

    public static void main(String[] args) {


    int[] array = new int[] {92,22,7,110,16,58,35};

    //invoking sort method of the array class
        Arrays.sort(array);

        System.out.println("Elements of array sorted in ascending order: ");

    //print array using the for loop
        for (int i = 0; i < array.length; i++)
    {
        System.out.println(array[i]);
    }
}


}
