import java.util.*;
public class UglyNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int n=N;

        while (n % 2 == 0)
            n /= 2;

        while (n % 3 == 0)
            n /= 3;

        while (n % 5 == 0)
            n /= 5;

        if(n == 1)
        System.out.println(N);

        }
    }
}