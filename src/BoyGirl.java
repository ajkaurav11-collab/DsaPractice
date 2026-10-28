import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> a=new HashSet<>();
        String s=sc.next();


        for (int i=0;i<s.length();i++){
            a.add(s.charAt(i));


        }


        int c=a.size();
        if(c%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }


    }
}
