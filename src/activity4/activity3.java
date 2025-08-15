package activity4;

import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no;
        
        System.out.print("Enter a number: ");
        no = sc.nextInt();
        System.out.println("");
        
        if(no == 0){
            System.out.println("Inputted number is 0");
        }else if(no < 0){
            System.out.println(no + " is a negative number");
        }else{
            System.out.println(no + " is a positive number");
        }
    }
}
