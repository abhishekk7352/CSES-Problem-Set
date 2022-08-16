import java.util.*;
class incr {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
  long ans=0;
   for(int i=1;i<arr.length;i++){
       if(arr[i-1]>arr[i]){
           int diff=arr[i-1]-arr[i];
           ans+=diff;
           arr[i]=arr[i]+diff;
       }
   }
    System.out.println(ans);
    }
}