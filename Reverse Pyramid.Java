import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter n;");
          int n= sc.nextInt();                     // Get input
          
          for(int i=n;i>0;i--){                    // Rows
            for(int j=n-i-1;j>=0;j--){
                System.out.print(" ");             // Print Spaces
            }
            for(int j=2*i-1;j>0;j--){
            System.out.print("*");                 // Print Stars
                
            }
             System.out.println();
          }
        }
    }
