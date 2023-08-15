package array;
import java.util.*;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int temp =0;
        // boolean flag=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                // flag=false;
                System.out.println("not sorted");
                break;
            }
            else{
                System.out.println("sorted");
                break;
            }
        }
        // if(flag){
        //     System.out.println("Sorted");
        // }
        // else{
        //     System.out.println("Not Sorted");
        // }
    }
    
}
