package activity4;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String name;
            int rate, total;
            float wage, cont, net;
            
                System.out.print("Enter employee name: ");
                name = sc.nextLine();
                
                System.out.print("Enter hourly rate: ");
                rate = sc.nextInt();
                
                System.out.print("Enter total hours worked this week: ");
                total = sc.nextInt();
                wage = rate * total;
                cont = wage * 0.10f;
                net = wage - cont;
                
                System.out.println("\n--- Wage Summary ---");
                System.out.println("Employee: "+name);
                System.out.println("Hourly Rate: ₱"+String.format("%.2f", wage));
                System.out.println("Hours Worked: "+total);
                System.out.println("Gross Weekly Wage: ₱"+String.format("%.2f", wage));
                System.out.println("SSS Contribution (10%): ₱"+String.format("%.2f", cont));
                System.out.println("---------------------");
                System.out.println("Net Weekly Wage: ₱"+String.format("%.2f", net));
    }
    
}
