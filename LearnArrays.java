package week1.day2;

import java.util.Arrays;

public class LearnArrays {
// Array used to store multiple values in a single variable of SAME datatype
	// here datatype is String but many variables
	public static void main(String[] args) {
		
	
	
	String str1="Hi";
	String str2="Hello";
	String str3="Welcome";
	String str4="Blessed";
	
	// desclaring in Array
	// this is called as initializing an array
	
	String[] str= {"Hi", "Hello", "Welcome", "Blessed"};
	 int [] arrNum = {12, 345,21,99,43, 100};
	 
	 // to access the element in an array using INDEX
	// this index 2 is to access the third element.
	 
	 int result = arrNum[2];
   System.out.println("the third value is " + result);
 
   // to get the number of elements in an array - length
   
   int LengthArr = arrNum.length;
   System.out.println("the length of array : " + LengthArr);
   
   
   // to find all the elements in an array.
   
   for (int i = 0; i < arrNum.length; i++) {
	   
	   System.out.println("arrNum["+i+"]=" + arrNum[i]);
	
   }  
	   // sorting the array
	   
	   Arrays.sort(arrNum);
System.out.println("this is the sorted array");
for (int i = 0; i < arrNum.length; i++) {
	   
	   System.out.println("arrNum["+i+"]=" + arrNum[i]);
	
}
	   
}
}