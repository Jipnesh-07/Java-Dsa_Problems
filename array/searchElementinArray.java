package array;
import java.util.Scanner;

public class searchElementinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
