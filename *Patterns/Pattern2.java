/*
Inverted and Rotated half pyramid
              * 
            * * 
          * * * 
        * * * * 
      * * * * * 
    * * * * * * 
  * * * * * * * 
* * * * * * * * 
*/
public class Pattern2 {
    public static void main(String[] args)
    {
        int n = 8;
        //Outer loop
        for(int i=1; i<=n; i++)
        {

            //Inner loop for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }

            //Inner loop for *
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
