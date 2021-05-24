
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<>();
        arrays.add(4);
        arrays.add(5);
        arrays.add(7);
        arrays.add(8);
        arrays.add(3);
        arrays.add(1);
        Collections.sort(arrays);
        for (Integer array : arrays) {
            System.out.println(array);
        }
        int left = arrays.get(0);
        int right = arrays.get(arrays.size()-1);
        System.out.println("=====================");
        System.out.println(binarySearch(arrays,left,right,7));
    }
    public static int binarySearch(ArrayList<Integer> array , int left , int right , int value){
        int middle = (left+right)/2;
            if (array.get(middle) ==value){
                return middle;
            }else if (array.get(middle) >value)  {
               return binarySearch( array,left,middle-1,value);
            }else if (array.get(middle) <value){
               return binarySearch(array,middle+1,right,value);
            }
        return -1;
        }

}
