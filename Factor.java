import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Factor {
    public static void main(String args[]){
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int m=n;
        ArrayList<Integer> li=new ArrayList<>();
        while(n>0) {
            if (m % n == 0) {
                li.add(n);
            }
            n--;
        }
        Collections.sort(li);
        System.out.println(li);
        if(k<li.size()){
        System.out.println(li.get(k));
        }
        else{
            System.out.print("1");
        }
    }
}
