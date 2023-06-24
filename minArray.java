import java.util.*;
public class minArray {
    public static void main(String[] args) {
        // String arr[] = {"DBA","AAB","AVC","DAA","AAE"};
        // String max = Collections.max(Arrays.asList(arr));
        // System.out.println(max);

        // int arr[] = {2,8,-7,3,-6,14,-9};
        // Arrays.sort(arr,0,5);
        // for(int i=0; i<arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


        Integer arr[] = {2,5,8,6,3,1,4,9};
        Arrays.sort(arr, 0,5, Collections.reverseOrder() );
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");

        }





    }
    
}
