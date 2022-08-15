// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class weiredalgo {


    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        long n=sc.nextLong();
    System.out.print(n+"\t");
    while(n!=1){
        
    
    if(n%2==0){
        n=n/2;
        System.out.print(n+"\t");
        continue;
    }
    if(n%2!=0){
        n=3*n+1;
        System.out.print(n+"\t");
        continue;
    }
    }
       
    }
}