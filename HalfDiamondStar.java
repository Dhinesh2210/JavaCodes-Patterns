import java.util.Scanner;
class HelloWorld {
    static void Pyramid(int n){
        for(int i=0;i<n/2;i++){  
            for(int j=0;j<=i;j++)
            System.out.print("*");
             System.out.println();
    }
    }
    static void ReversePyramid(int n){
        for(int i=0;i<n;i++){  
            for(int j=n/2+1;j>i;j--)
            System.out.print("*");
             System.out.println();
    }
    }
    public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter n;");
          int n= sc.nextInt();
          Pyramid(n);
         ReversePyramid(n);
           
          
        }
    }
