import java.util.Scanner;

public class Stock {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxp=arr[0];
        int maxloss=0;
        for(int i=1;i<n;i++){
            int p=arr[i];
            int loss=maxp-p;
            if(loss>maxloss){
                maxloss=loss;
            }
            if(p>maxp){
                maxp=p;
            }
        }
        System.out.println(maxloss);
    }
}
