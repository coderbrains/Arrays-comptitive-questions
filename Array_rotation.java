Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.



//solution

class GFG {
	public static void main (String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int k = sc.nextInt();
	    
	    while(k-->0){
	        int n = sc.nextInt();
	        int[]a =new int[n];
	        int d = sc.nextInt();
	        int b[] = new int[d];
	        int count = 0;
	        int count1 = 0;
	        for(int i = 0; i < n; i++){
	            if(i < d){
	                b[count++] = sc.nextInt();
	                continue;
	            }
	            a[count1++] = sc.nextInt();
	            
	        }
	       count =0;
	        for(int i= 0; i < n; i++){
	            if(i < n-d){
	                System.out.print(a[i] + " ");
	                continue;
	            }
	            System.out.print(b[count++] + " ");
	        }
	        System.out.println();
	    }
	    
	}
}