
import java.util.*;
class abhi{
public static void main(String[] args)  {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
StringBuilder sb=new StringBuilder();
if(n==1)
System.out.println("1");
else if(n==2 || n==3)
System.out.println("NO SOLUTION");
else{
for(int i=2;i<=n;i+=2)
sb.append(i+" ");
for(int i=1;i<=n;i+=2)
sb.append(i+" ");
System.out.print(sb);
}
}
}

