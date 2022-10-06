package Arrays;

import java.util.*;
public class binSearch {
    // public static int binSearch(int numbers[], int key) {
    //     int start = 0, end = numbers.length-1;
        
        
    //     while(start<=end) {
    //         int mid= (start+end)/2;
    //         if(numbers[mid] == key) {
    //             return mid;
    //         }
    //         // Comparison
    //         if(numbers[mid]<key) {
    //             start = mid+1; //Right(2nd half)
    //         }else{
    //             end = mid-1; //Left(1st half)
    //         }


    //     }
    //     return -1;

    // }
    // public static void main(String args[]) {
    //     int numbers[] = {2,4,6,8,10,12,14,16};
    // }
        // int key = 4;
    //     System.out.println("Index for key is : " + binSearch(numbers, key));
        
    // }
    public static void reverse(int numbers[]) {
        int first =0;
        int last = numbers.length-1;
        while(first<last) {
            int temp = numbers[last]; 
            numbers[last] = numbers[first];
            numbers[first] = temp; 
            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
}
