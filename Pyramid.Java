import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter n;");
          int n= sc.nextInt();                //get user input   

          for(int i=0;i<n;i++){               // initialise rows 

            for(int j=0;j<n-i-1;j++){         // Print Space
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){         // print Stars
            System.out.print("*");
                
            }
             System.out.println();
          }
        }
    }
