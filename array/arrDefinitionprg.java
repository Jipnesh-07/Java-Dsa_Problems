package array;

import java.util.Scanner;

public class arrDefinitionprg {
     static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int arr[] = new int[5];
            arr[0] = 9;
            arr[1] = 5;
            arr[2] = 6;
            arr[3] = 7;
            arr[4] = 8;
            System.out.println("original array");
            printArray(arr);

            System.out.println("copied array");
            // int arr2[] = arr;  //if we use this thing it will cahnge original array also
            int arr2[] = arr.clone();
            printArray(arr2);

            System.out.println("changing value of array");
             arr2[0]=0;
             arr2[1]=0;

             System.out.println("original array");
             printArray(arr);
             System.out.println("Copied array");
             printArray(arr2);

    }
}
