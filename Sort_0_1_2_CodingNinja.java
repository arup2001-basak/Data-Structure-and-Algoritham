import java.util.* ;
import java.io.*; 
public class Solution 
 {
    public static void sort012(int[] arr)
    {
        int i=0,j=0,k=arr.length-1;
        while(i<=k){
            if(arr[i]==1){
                i++;
            }
           else if(arr[i]==0){
                 int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
               j++;
            }
            else {
               int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
        }
    }
}
