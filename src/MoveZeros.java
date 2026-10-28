import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> temp=new ArrayList<>();
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int  i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        System.out.println(temp);
        int nz=temp.size();

        for(int i=0;i<nz;i++){
            arr[i]=temp.get(i);

        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
