public class Palendrom {
    public static void main(String[] args) {
        int a=121;
        int b=a;
        int pel=0;
        for(int i=0;i<a;i++){
            pel=(pel*10)+a%10;
            a/=10;
            i--;
        }
        if(pel==b) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
