

public class ExtraCredit {
	/*1.Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one ascending sorted array.
	*You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements 
	*from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
	*/
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int number1= m-1;
		int number2= n-1;
		int result = m+n-1;
		
		while (number1 >=0 && number2 >=0){
			if (nums1[number1]>= nums2[number2]){
				nums1[result]=nums1[number1];
				number1--;
			}else{
				nums1[result]= nums2[number2];
				number2--;
			}
			result--;
		}
		if (number2 >=0){
			while (result>=0){
				nums1[result]= nums2[result];
				result--;
			}
		}
		
		
		
	}
	/* 2.Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
	 	*For example,Given the following matrix:
			* {{1,2,3},
			* {4,5,6},
			* {7,8,9}}
			* You should return {1,2,3,6,9,8,7,4,5}.*/

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result= newArrayList<Integer>();
		if (matrix==null||matrix.length==0||matrix[0].length==0)
			return result;
		int j= matrix.length;
		int i= matrix[0].length;
		
		int left=0;
		int right=i-1;
		int top=0;
		int bottom= j-1;
		
		while(result.size()<j*i){
			for(int x=left; x<=right; x++){
				result.add(matrix[top][x]);
			}
			top++;
			for (int y=top; y<=bottom; y++){
				result.add(matrix[y][right]);
			}
			right--;
		}
		if (bottom<top)
			break;
		
		for(int x=right; x>=left; x++){
			result.add(matrix[bottom][x]);
		}
		bottom--;
		
		if(right<left)
			break;
		
		for(int y=bottom; y>=top; y--){
			result.add(matrix[y][left]);
		}
		left++;
		
		}
		return result;



}

