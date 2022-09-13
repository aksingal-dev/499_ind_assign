import java.util.Arrays;

public class asc {
    public static Integer[] ascend(String[] args) {
        
        Integer[] arr = new Integer[args.length]; 
        Arrays.fill(arr, 0);
        for (int i=0;i<args.length; i++){
            arr[i] = Integer.valueOf(args[i]);
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        return arr;
    }
}
