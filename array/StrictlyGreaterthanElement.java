package array;

import java.util.Scanner;

public class StrictlyGreaterthanElement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int count = 0;
    int x = sc.nextInt();
    for(int i=0;i<arr.length;i++){
        if(arr[i]>x){
            count++;
            
        }
    }
    System.out.println(count);
        
    }
   
}

