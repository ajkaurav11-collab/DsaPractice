import java.util.Arrays;
import java.util.Scanner;
public class RightRotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of d:-");
        int d=sc.nextInt();
        int []temp=new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[n-d];
            n++;
        }
        System.out.println(Arrays.toString(temp));
        for(int i=d;i>-1;i--){
            arr[i+d]=arr[i];


        }
        System.out.println(Arrays.toString(arr));
        int j=0;
        for(int i=0;i<d;i++){
            arr[i]=temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
