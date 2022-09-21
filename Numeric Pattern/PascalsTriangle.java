/*
Pascal's Triangle
n = 5
            1  
           1 1 
          1 2 1  
         1 3 3 1 
        1 4 6 4 1

It is very difficult to print Pascal's Triangle without matrix
Create a 2D array of size [N][N]
Try to corelate with matrix
insert 
    if (j=0 or j=i) insert 1
    Otherwise insert A(i-1, j-1) + A(i-1, j)
Print in the form of triangle

*/

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int Array[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                //For inserting 1 at outer side
                if (j == 0 || j == i) {
                    Array[i][j] = 1;
                } else {
                    //Addition 
                    Array[i][j] = Array[i-1][j-1] + Array[i-1][j];
                }
            }
        }

        System.out.println("\nCreted matrix::\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPascal's triangle:: \n");
        //Printing Triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(Array[i][j] + " ");
            }

            System.out.println();
        }
    }
}
