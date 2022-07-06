// a problem taking two sorted arrays and printing the union of the two arrays.
// Time Complexity : O((m+n) * log(m+n))

import java.util.*;
import java.io.*;
import java.lang.*;

class solution{
  public static void main(String[] args){
    int a[] = new int[]{3,5,8};
    int b[] = new int[]{2,8,9,10,15};
    
    int m = a.length;
    int n = b.length;
    
    printUnion(a,b,m,n);
    
  }
  
  public void printUnion(int a[], int b[], int m, int n){
    int[] c = new int[m+n];
    for(int i = 0; i<m ; i++){
      c[i]=a[i];
    }
    for{int i = 0; i<n; i++){
      c[i+m] = b[i];
    }
        Arrays.sort(c);
        
        for(int i = 0 ; i<m+n ; i++){
          if(i==0 || c[i] != c[i-1]){
            System.out,println(c[i] + " ");
          }
        }
       }
  }
    
  
