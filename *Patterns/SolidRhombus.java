/*
Solid Rhombus
n = 5
         * * * * * 
       * * * * *   
     * * * * *     
   * * * * *       
 * * * * *           
 */

public class SolidRhombus {
    public static void main(String[] args) {
        int n=5;
        //Outer loop
        for(int i=1; i<=n; i++) {
            //Inner loop for Spaces
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("  ");
            }

            //Inner loop for *s
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
