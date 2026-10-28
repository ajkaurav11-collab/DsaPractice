import java.util.Arrays;
import java.util.Scanner;

public class MoveEleByOnePlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        for(int i=0;i<5;i++){
             arr [i]=sc.nextInt();
        }
        int temp=arr[5-1];
        for(int i=5-2;i>-1;i--){
            arr[i+1]=arr[i];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
        for(int i : arr){
            System.out.print(i+ " ");
        }

    }
}
