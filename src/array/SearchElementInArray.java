/**
 * 
 */
package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * How to Check if an Array Contains a Value in Java Efficiently?
 * There are three different ways to check targeted value in array
 * 1. Using List data structure
 * 2. Using Set data structure
 * 3. Using Binary Search
 * 4. Using Linear search
 * Most efficient way to do is using Binary search in terms of growing data
 * @author ashuu
 *
 */
public class SearchElementInArray {

	
	public static boolean usingListDS(String[] array,String targetedValue) {
		List<String> listObj = Arrays.asList(array);
		return listObj.contains(targetedValue);
	}
	
	public static boolean usingSetDS( String[] array,String targetedValue) {
		Set<String> setObj	 = new HashSet<>(Arrays.asList(array));
		return setObj.contains(targetedValue);
	}
	
	
	public static boolean usingLinearSearch( String[] array,String targetedValue) {
		for(String str:array) {
			if(str.equals(targetedValue)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean usingBinarySearch(String[] array,String targetedValue) {
		int result = Arrays.binarySearch(array, targetedValue);
		if(result > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void executeAllMethods(String[] arr,String target) {
		//use list
				long startTime = System.nanoTime();
				for (int i = 0; i < 100000; i++) {
					usingListDS(arr, target);
				}
				long endTime = System.nanoTime();
				long duration = endTime - startTime;
				System.out.println("useList:  " + duration / 1000000);
			 
				//use set
				startTime = System.nanoTime();
				for (int i = 0; i < 100000; i++) {
					usingSetDS(arr, target);
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("useSet:  " + duration / 1000000);
			 
				//use loop
				startTime = System.nanoTime();
				for (int i = 0; i < 100000; i++) {
					usingLinearSearch(arr, target);
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("useLoop:  " + duration / 1000000);
				
				//use binary search
				startTime = System.nanoTime();
				for (int i = 0; i < 100000; i++) {
				usingBinarySearch(arr, target);
						}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("usingBinarySearch:  " + duration / 1000000);
						
				
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"aa","bb","cc","cc","ee"};
		executeAllMethods(arr,"A");
		
		//Testcase1:Using larger array 1k
		String[] arr1 = new String[1000];
		 Random s = new Random();
		 for(int i=0; i< 1000; i++){
			 arr1[i] = String.valueOf(s.nextInt());
		 }
		 executeAllMethods(arr1,"A");
		
		 //Testcase2:Using larger array 10k
		 String[] arr2 = new String[10000];
		  s = new Random();
		 for(int i=0; i< 10000; i++){
			 arr2[i] = String.valueOf(s.nextInt());
		 }
		 executeAllMethods(arr2,"A");
		
		 //Testcase2:Using larger array 100k
		 String[] arr3 = new String[100000];
		  s = new Random();
		 for(int i=0; i< 100000; i++){
			 arr3[i] = String.valueOf(s.nextInt());
		 }
		 executeAllMethods(arr3,"A");
		
		 
	}

}
