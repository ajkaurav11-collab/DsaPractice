import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
//        HashMap<Integer,Integer>map=new HashMap<>();
//        map.put(1,100);
//        map.put(2,400);
//        map.put(3,690);
//        map.put(4,120);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }
        System.out.println(freq);



    }
}
