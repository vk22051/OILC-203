package patterns;

/**
 * 
 * @author sv22044
 *      *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *
 */
public class Pattern16 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(j<=i) 
				{
				System.out.print("* ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


}