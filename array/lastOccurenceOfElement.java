package array;

import java.util.Scanner;

public class lastOccurenceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        int lastindex = -1;
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex = i;
            }
        }
        System.out.println(lastindex);
    }
}
