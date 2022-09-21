/*
n = 5
        1 
       1 1    
      1 2 1   
     1 3 3 1  
    1 4 6 4 1 
 */

public class PascalsTriangleUsingNCR {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int ncr(int n, int r) {
        return factorial(n) / (factorial(n-r) * factorial(r));
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {

                    System.out.print(ncr(i-1, j-1) + " ");
            }
            System.out.println();
        }
    }
}
