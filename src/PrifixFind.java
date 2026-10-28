import java.util.*;
public class PrifixFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String str1=arr[0];
        String str2=arr[arr.length-1];
        int index=0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        if(arr.length==0){
            System.out.println(" ");
        }else{
            System.out.println(str1.substring(0,index));
        }


    }
}
