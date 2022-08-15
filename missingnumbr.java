// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class missingnumbr {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int []arr=new int[n];
     for(int i=0;i<n-1;i++){
         arr[i]=sc.nextInt();
     }
     int a=n;
     int b=1;
     int i=0;
    
    while(i<n-1){
         a=a-arr[i]+b;
        b++;
        i++;
    }
    System.out.println(a);
     
    }
}