package activity4;

import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nm, rm, ms;
        int sci, his, math, soc, arts;
        double tt,ave;
        
        System.out.print("Enter name: ");
        nm = sc.nextLine();
        System.out.print("Enter marks in Science: ");
        sci = sc.nextInt();
        System.out.print("Enter marks in History: ");
        his = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        arts = sc.nextInt();
        
        tt = sci + his + math + soc + arts;
        ave = tt / 5;
        
        if(ave<70){
            rm = "Fail";
            ms = "Try Again";
        }else if(ave<76){
            rm = "Poor";
            ms = "Congrats ";
        }else if(ave<81){
            rm = "Fair";
            ms = "Congrats ";
        }else if(ave<86){
            rm = "Good";
            ms = "Congrats ";
        }else if(ave<91){
            rm = "Very Good";
            ms = "Congrats ";
        }else{
            rm = "Excellent";
            ms = "Congrats ";
        }
        
        System.out.printf("\nTotal Marks: %.0f", tt);
        System.out.printf("\nTotal Percentage: %.2f", ave);
        System.out.println("\nRemarks: "+ rm);
        System.out.println("");
        
        System.out.println(ms + nm + " you Passed.");
        
    }
    
}
