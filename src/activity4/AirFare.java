package activity4;

import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis, cl;
        double tf;
        
        System.out.print("Distance(km): ");
        dis = sc.nextInt();
        
        System.out.print("Class: ");
        cl = sc.nextInt();
        
        switch (cl){
            case 1:
                tf = dis * 250;
                if(dis>=1000){
                    tf = tf * .90;
                    System.out.printf("\nTotal fare: %.2f",tf);
                }else{
                    System.out.printf("\nTotal fare: %.2f",tf);
                }
            break;
            case 2:
                tf = dis * 500;
                if(dis>=1000){
                    tf = tf * .90;
                    System.out.printf("\nTotal fare: %.2f",tf);
                }else{
                    System.out.printf("\nTotal fare: %.2f",tf);
                }
            break;
            default:
                System.out.print("Invalid class!");
        }
    }
}
