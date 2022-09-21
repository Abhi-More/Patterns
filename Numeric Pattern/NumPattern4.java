/*

n = 5
        1 
       1 1
      1 5 1 
     1 6 7 1
    1 7 8 9 1 

*/

public class NumPattern4 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j =1; j<=i; j++) {
                if(j==1 || j==i) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print(i+j + " ");
                }
            }
            System.out.println();
        }
    }
}
