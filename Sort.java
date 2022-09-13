import java.util.Arrays;

public class Sort {
    
    public static void main(String[] args) {
        String[] t1 = {"1", "3", "5", "7", "8"};
        String[] t2 = {"55", "-5", "67", "0", "100"};
        String[] t3 = {"-2", "-1", "0", "1","2"};
       
        asc ascend = new asc();
        System.out.println("\n ################################################# Test 2 ################################################### \n");
        ascend.ascend(t1);
        System.out.println("\n ################################################# Test 2 ################################################### \n");
        ascend.ascend(t2);
        System.out.println("\n ################################################# Test 2 ################################################### \n");
        ascend.ascend(t3);
    }
}
