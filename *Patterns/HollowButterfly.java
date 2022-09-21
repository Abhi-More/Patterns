/*
Hollow Butterfly
n = 5
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
*/

public class HollowButterfly {
    public static void main(String[] args) {
        int n = 100;
        //Upper Half
        for(int i = 1; i<=n; i++) {

            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            //Middle Spaces
            int space = 2*(n-i);
            for(int j = 1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--) {
                if(j == 1 || j == i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Lower Half
        for(int i = n; i>=1; i--) {

            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            //Middle Spaces
            int space = 2*(n-i);
            for(int j = 1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--) {
                if(j == 1 || j == i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
