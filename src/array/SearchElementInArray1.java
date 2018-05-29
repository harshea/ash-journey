/**
 * 
 */
package array;

/**
 * @author ashuu
 *
 */
public class SearchElementInArray1 {
	
	
	/**
	 * Here we are achieving time complexisty 
	 * but we are enromasly using space by defining big array to hold values of array as index
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,-5,9,8};
		int target = -10;
		int[][] bigArray = new int[20][2]; //space complexity
		
		for(int i =0;i<array.length;i++) {
			int temp = array[i];
			if(temp >= 0) {
				bigArray[temp][0] = temp;
			}else {
				bigArray[Math.abs(temp)][1] = temp;
			}
			
		}
		
		//display new array
		for(int j=0;j<bigArray.length;j++) {
			System.out.println(bigArray[j][0] +" "+ bigArray[j][1] +",");	
			
		}
		
		//search element
		if(target >= 0 && bigArray[target][0] != 0) {
			System.out.println("Present");
		}else if(target < 0 && bigArray[Math.abs(target)][1] != 0) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
			
	}

}
