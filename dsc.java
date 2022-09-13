import java.util.Arrays;
import java.util.Collections;

public class dsc {
    public static Integer[] descend(String[] args){
        Integer[] arr = new Integer[args.length]; 
        Arrays.fill(arr, 0);
        for (int i=0;i<args.length; i++){
            arr[i] = Integer.valueOf(args[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());;
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        return arr;
    }
}
