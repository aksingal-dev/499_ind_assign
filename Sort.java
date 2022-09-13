import java.util.Arrays;

public class Sort {
    
    public static void main(String[] args) {
        String[] t1 = {"1", "3", "5", "7", "8"};
        String[] t2 = {"55", "-5", "67", "0", "100"};
        String[] t3 = {"-2", "-1", "0", "1","2"};

        Integer[] a1 = {1, 3, 5, 7, 8};
        Integer[] a2 = {-5, 0, 55, 67, 100};
        Integer[] a3 = {-2, -1, 0, 1, 2};
        
        Integer[] d1 = {8, 7, 5, 3, 1};
        Integer[] d2 = {100, 67, 55, 0, -5};
        Integer[] d3 = {2, 1, 0, -1, -2};

        Integer[] tester = new Integer[5];
        
        //TESTING ASCENDING SORT
        asc ascend = new asc();
        System.out.println("\n ################################################# Test 2 ################################################### \n");
        tester = ascend.ascend(t1);
        if(Arrays.equals(tester, a1)){
            System.out.println("\n Test Passed\n");
        }else{
            System.out.println(" \n Test Failed \n");
        }
        System.out.println("\n ################################################# Test 2 ################################################### \n");
        tester = ascend.ascend(t2);
        if(Arrays.equals(tester, a2)){
            System.out.println("\n Test Passed\n");
        }else{
            System.out.println(" \n Test Failed \n");
        }
        System.out.println("\n ################################################# Test 2 ################################################### \n");
        tester = ascend.ascend(t3);
        if(Arrays.equals(tester, a3)){
            System.out.println("\n Test Passed\n");
        }else{
            System.out.println(" \n Test Failed \n");
        }

         //TESTING DESCENDING SORT
         dsc descend = new dsc();
         System.out.println("\n ################################################# Test 2 ################################################### \n");
         tester = descend.descend(t1);
         if(Arrays.equals(tester, d1)){
             System.out.println("\n Test Passed\n");
         }else{
             System.out.println(" \n Test Failed \n");
         }
         System.out.println("\n ################################################# Test 2 ################################################### \n");
         tester = descend.descend(t2);
         if(Arrays.equals(tester, d2)){
             System.out.println("\n Test Passed\n");
         }else{
             System.out.println(" \n Test Failed \n");
         }
         System.out.println("\n ################################################# Test 2 ################################################### \n");
         tester = descend.descend(t3);
         if(Arrays.equals(tester, d3)){
             System.out.println("\n Test Passed\n");
         }else{
             System.out.println(" \n Test Failed \n");
         }
    }
}
