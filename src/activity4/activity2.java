package activity4;

import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no;
        
        System.out.print("Enter a number: ");
        no = sc.nextInt();
        
        if(no == 0){
            System.out.println("\nInputted number is 0");
        }else if(no %2 != 0){
            System.out.println("\nInputted number is odd");
        }else{
            System.out.println("\nInputted number is even");
        }
    }
}
