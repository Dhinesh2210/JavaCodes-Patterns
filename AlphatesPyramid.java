import java.util.Scanner;
import java.util.*;

class Main {
    static void Pyramid(int n){
        // int increment=(2*i+1)/2;
        
        for(int i=0;i<n;i++){  
            
              for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
                }
                // int breakpoint=(2*i+1)/2;
                char ch='A';
                for(int j=0;j<2*i+1;j++){
                    
                    System.out.print(ch);
                    // if(j<=breakpoint)
                    ch++;
                
                    // else
                    // ch--;
                // System.out.print("*");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter n;");
          int n= sc.nextInt();
          Pyramid(n);
        }
    }
