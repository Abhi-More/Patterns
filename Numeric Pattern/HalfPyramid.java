/*
 Half Pyramid
 n = 5
    1   
   1 2  
  1 2 3 
 1 2 3 4  
1 2 3 4 5 
*/

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //Initial Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    }
}
