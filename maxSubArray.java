package MaximumSumSubarrayofSizeK;

import java.util.Arrays;

public class maxSubArray {
	
	public static int findResult(int k, int[] arr) {
		int maxSum = 0;
		int currSum = 0;
		int windowStart = 0;
		
		for(int windowEnd = 0; windowEnd < arr.length - 1; windowEnd++) {
			currSum += arr[windowEnd];
			
			if(windowEnd >= k - 1) {
				maxSum = Math.max(maxSum, currSum);
				currSum -= arr[windowStart];
				windowStart++;
				
			}
		}
		
		
		return maxSum;
	}

	public static void main(String[] args) {
		int result = findResult(2, new int[] { 2, 3, 4, 1, 5 });
	    System.out.println("Max sub array = " + result);

	}

}
