/*
Diamond Pattern
n = 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/

public class DiamondPattern {
    public static void main(String[] args) {
        int n =5;
        //For upper half part
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //Stars = 2*i-1
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //For Lower half part
        for(int i=n; i>=1; i--) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //Stars = 2*i-1
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
