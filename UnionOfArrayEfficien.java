// Time complexity : O(m+n)
// a problem taking two sorted arrays and printing the union of the two arrays.
// Efficient Method.

class solution{
  public static void main(String[] args){
    int i = 0, j = 0;
    while(i<m && j<n){
      if(i>0 && a[i] == a[i+1]){
        i++;
        continue;
      }
      if(j>0 && b[j] == b[j+1]){
        j++;
        continue;
      }
      if(a[i] < b[j]){
        System.out.println(a[i]+ " ");
        i++;
      }
      else if(a[i] > b[j]){
        System.out.println(b[j]+ " ");
        j++;
      }
      else{
        System.out.println(a[i]+ " ");
        i++;
        j++;
      }
    }
    while(i<m){
      if(i==0 || a[i] != a[i-1]{
        System.out.println(a[i]+ " ");
        i++;
      }
         }
     while(j<n){
      if(j==0 || b[j] != b[j-1]{
        System.out.println(b[j]+ " ");
        j++;
      }
         }
    }
         
