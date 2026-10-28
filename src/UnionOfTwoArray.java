import java.util.*;
public class UnionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();

        }
        int m=sc.nextInt();
        int [] nums2=new int[m];

        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int u=m+n;
        int [] union=new int[m+n];
        for(int i=0;i<n;i++){
            if(nums1[i]!=0){
                union[i]=nums1[i];

            }
        }
        for(int i=0;i<m;i++){
            if(nums2[i]!=0){
                union[n]=nums2[i];

            }
        }
        System.out.println(Arrays.toString(union));
    }
}
