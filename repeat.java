// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class repeat {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     if(str.length()==0)
     System.out.println(0);
    int count=1;
    int curcnt=1;
    for(int i=0;i<str.length();i++){
        if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
        curcnt++;
        else{
            if(count<curcnt)
            count=curcnt;
            curcnt=1;
        }
        
    }
     System.out.println(count);
    }
}