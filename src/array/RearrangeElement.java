/**
 * 
 */
package array;

/**
 * @author ashuu
 *
 */
public class RearrangeElement {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,9,-4,3};
		
		//Loop from i = 1 to n-1 and if current element is positive do nothibg
		//if current element is negative then shift elements to the right till positive element
		//and insert current negative element to the current position
		
		int len = a.length;
		for(int i =0;i<len;i++) {
			int key = a[i];
			
			if(key > 0) {
				continue;
			}
			
			int j = i-1;
			while(j>=0 &&a[j] > 0) {
				a[j+1] = a[j];
				j = j-1;
			}
			
			a[j+1] = key;
		}
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
		}
	}

}
