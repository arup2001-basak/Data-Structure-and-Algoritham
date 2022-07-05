/*
input: 
  arr[] = {1,4,4,1,0,1}
  k = 5; 
  n = 6;
 ---------------
 output : 
  arr[] = {0,1,1,1,4,4};
 ---------------
 Algoritham :
 case1:
  count[] = {0,0,0,0,0}
 case2:
  count[] = {1,3,0,0,2}
 case3:
  count[] = {1,4,4,4,6}
 case4:
  create a OUTPUT array with length "n";
 case5:
  output[] = {0,1,1,1,4,4}
 last: 
  transfer all output array to arr ;
  */

class main{
  void countSort(int arr[], int n , int k){
    int count[k];
    for(int i = 0;i<k; i++){
      count[i] = 0;
    }
    for(int i = 0; i<n; i++){
      count[arr[i]]++;
    }
    for(int i = 1; i<k ; i++){
      count[i] = count[i-1]+count[i];
    }
    int output[n];
    for(int i = n-1;i>=0; i--){
      output[count[arr[i]]-1]=arr[i];
      count[arr[i]]--;
    }
    for(int i=0; i<n; i++){
      arr[i] = output[i];
    }
  }
  
  
  
