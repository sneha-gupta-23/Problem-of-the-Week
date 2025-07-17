import java.util.*;
public class Approach1_binarySearch{
    public static int findMin(int[] arr){
        int lo=0, hi=arr.length-1;

        while(lo < hi){
            if(arr[lo] < arr[hi]){
                return arr[lo];
            }
            int mid = (lo + hi) / 2;

            if(arr[mid] > arr[hi]){
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }
        return arr[lo];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
    }
}