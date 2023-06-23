import java.util.*;
public class arrays {

    // public static boolean search (int matrix[][], int key) {
    //     for(int i=0; i<matrix.length; i++) {
    //         for(int j=0; j<matrix[0].length; j++) {
    //             if(matrix[i] [j] == key) {
    //                 System.out.println("found at cell ( " + i + "," + j + ")");
    //                 return true;
    //             }

    //         }
    //     }
    //     System.out.println("Key not found ");
    //     return false;


    // }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n=matrix.length, m=matrix[0].length;
        int l = matrix[0][0];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i] [j] = sc.nextInt();
                if(matrix[i][j] >l){
                    l=matrix[i][j];
                }

            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }
        System.out.println(l);
        System.out.println(matrix[1][2]);
        
        
    }
}