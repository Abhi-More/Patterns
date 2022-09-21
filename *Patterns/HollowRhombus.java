/*
Hollow Rhombus
    n = 5;

        * * * * * 
      *       *   
    *       *     
  *       *       
* * * * * 

 */

public class HollowRhombus {
    public static void main(String[] args) {
        int n =5;
        //Outer loop for rows
        for(int i = 1; i<=n; i++)
        {
            //Inner loop for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
