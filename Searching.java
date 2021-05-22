Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A.

Example 1:

Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
Output:
5
Explanation: 10 is found at index 5.
Example 2:

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
Output:
-1
Explanation: There is no element that has value 6.
Your Task:
Complete the function search() which takes an array arr[] and start, end index of the array and the K as input parameters, and returns the answer.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 107
0 ≤ A[i] ≤ 108
1 ≤ key ≤ 108


//solution

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        int pivot = 0;
        for(int i = 1; i<A.length-1;i++){
            if(A[i-1]>A[i]){
                pivot = i;
                break;
            }
        }
        
        int low = 0;
        int high = pivot- 1;
        int mid;
        while(high >= low){
            mid = (low + high)/2;
            if(A[mid] > key){
                high = mid - 1;
            }else if(A[mid] < key){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        
        low = pivot;
        high = A.length - 1;
        
        while(high >= low){
            mid = (low + high)/2;
            if(A[mid] > key){
                high = mid - 1;
            }else if(A[mid] < key){
                low = mid + 1;
            }else{
                return mid;
            }
        }return -1;
    }
}