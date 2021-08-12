package week1.day2;

import java.util.Arrays;

public class FindLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] testNum= {21,67,34,908,56,19, 45, 87, 30};
	int lengthR = testNum.length;	
	System.out.println("The lengthof the arary is : " + lengthR);
	Arrays.sort(testNum);
	System.out.println("this is the sorted Array - ");
	for (int i = 0; i < testNum.length; i++) {
		
	System.out.println("testNum ["+i+"]=" + testNum[i]);
	if (i==lengthR-1) {
		System.out.println("This is the largest element : testNum ["+i+"]=" + testNum[i] );
		
	}
	}
	
	}

}
