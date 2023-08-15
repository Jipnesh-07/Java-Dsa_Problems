package array;
import java.util.*;

public class swapTwoValues {

    static void Swap(int a, int b){
        System.out.println("Original values of a and b : " +a +" " +b);
        System.out.println("After swapping : ");
        int temp =a; //temp =9;
        a=b; //a=3
        b=temp; //b=9
        System.out.println("a : " +a);
        System.out.println("b : " +b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=9;
        int b=3;
        Swap(a, b);

    }
    
}
