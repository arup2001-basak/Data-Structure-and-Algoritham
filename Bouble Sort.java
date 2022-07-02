// Time Complexity: O(N^2)
// INPUT :  arr[] = {5, 1, 4, 2, 8}
// OUTPUT :  arr[] = {1, 2, 4, 5, 8}

class sorting{
  public void boubleSort(int arr[], int n ){
    boolean swapped;
    for(int i = 0; i<n-1;i++){
      swapped = flase;
      for(int j = 0; j < n-1-i; j++)
      {
        if(arr[j] > arr[j+1]){
          int trmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          
          swapped = true;
        }
      }
      if(swapped == flase){
        break;
      }
    }
  }
}
        
