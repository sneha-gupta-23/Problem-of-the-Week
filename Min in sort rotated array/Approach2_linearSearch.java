import java.util.*;

public class Approach2_linearSearch{      
    public static int findMin(int[] arr) {
        int res = arr[0];
        for (int i=1; i<arr.length; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
    }
}