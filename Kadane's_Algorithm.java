class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_so_far = Integer.MIN_VALUE;
        int max_end_point = 0;
        for(int i = 0; i< n; i++){
            max_end_point = max_end_point + arr[i];
            if(max_end_point > max_so_far){
                max_so_far = max_end_point;
            }
            if(max_end_point < 0){
                max_end_point = 0;
            }
        }
        
        return max_so_far;
        
    }
    
}



/*
Initialize:
    max_so_far = INT_MIN
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
  (c) if(max_ending_here < 0)
            max_ending_here = 0
return max_so_far




Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
*/


