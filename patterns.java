public class patterns {
    public static void hollow_rectangle(int totRows ,int totCols) {
        //outer loop
        for(int i = 1; i <= totRows; i++) {
            //inner loop
            for(int j = 1;j <= totCols; j++) {
                //boundary conditions
                if( i == 1 || i == totRows || j == totCols || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_halfPyramid(int n) { 
        //outer loop
        for(int i =1;i<=n;i++) {
            //space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void inverted_halfPyramid_withNumbers(int n) {
        //outer
        for(int i=1;i<=n;i++) {
          //inner_num
          for(int j=1;j<=n-i+1;j++) {
            System.out.print(j + " ");
          }
          System.out.println();
        }
        
    }
    public static void floyds_triangle(int n) {
        //outer
        int counter = 1;
        for(int i=1;i<=n;i++) {
            //inner_how many times will counter be printed
            for(int j=1;j<=i;j++) {
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n) {
        for(int i = 1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if( (i+j) % 2 == 0) {//even
                    System.out.print(" 1 ");
                } else {//odd
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    public static void Butterfly_pattern(int n) {
        //1st half
        for(int i = 1;i<=n;i++) {
            //stars-i
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            // space = 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            //stars = i
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n;i>=1;i--) {
             //stars-i
             for(int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            // space = 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            //stars = i
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n) {
        for(int i = 1;i<=n;i++) {
            //space
            for(int j = 1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_rhombus(int n) {
        for(int i = 1;i<=n;i++) {
            //space
            for(int j = 1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j = 1; j<=n;j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
    public static void diamond_pattern(int n) {
        //1st half
        for(int i = 1; i<=n;i++) {
            //space
            for(int j = 1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=(2*i)-1;j++) {
                 System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i = n; i>=1;i--) {
             //space
             for(int j = 1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=(2*i)-1;j++) {
                 System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        
       diamond_pattern(50);
    }
}
