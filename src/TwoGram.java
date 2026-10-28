import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TwoGram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        String ans="";
        int Max=0;
        int n=sc.nextInt();
        String s=sc.next().toUpperCase();
        for(int i=0;i<n-1;i++){
            String temp=s.substring(i,i+2);
            int c= map.getOrDefault(temp, 0) + 1;
            map.put(temp,c);
            if(c>Max){
                Max=c;
                ans=temp;
            }


        }
        System.out.println(ans);
        sc.close();
    }
}
