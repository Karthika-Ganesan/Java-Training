import java.util.*;
public class PairPrime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=4;
		int y=30;
		int count=0;
		for(int i=x;i<=y;i++){
		boolean Prime1=true;
		boolean Prime2=true;
		    for(int j=2;j<i/2;j++){
		        if(i%j==0){
		            Prime1=false;
		            break;
		        }
		    }
		    for(int j=2;j<(i+6)/2;j++){
		        if((i+6)%j==0){
		            Prime2=false;
		            break;
		        }
		    }
		    if(Prime1&&Prime2){
		    count++;
		    System.out.println(i+" "+(i+6));
		    }
		    else
		    continue;
		    }
		   System.out.println(count);
		}
	}