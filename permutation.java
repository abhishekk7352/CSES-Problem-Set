import java.util.*;

public class permutation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
	
		if(n==1)
		System.out.println("1");
		if(n==3|| n==2)
	System.out.println("NO SOLUTION");
		int k=0;
		if(n>=4){
		    for(long i=2;i<=n;i+=2)
		    System.out.print(i+" ");
		    for(long i=1;i<=n;i+=2)
		    System.out.print(i+" ");
		}
	}
}