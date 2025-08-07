package banking;

import java.util.Scanner;

public class banking {

    public boolean verifyAccount(int accNo) {
   
        return accNo == 54321;
       
    }
    public boolean verifyPin (int pin){
        return pin == 987654;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        banking banking = new banking();

        System.out.println("HELLO WELCOME TO MY BANKING SYSTEM");
        System.out.println("How can I help you today?");
        System.out.print("\n1. Banking");
        System.out.print("\n2. Doctor's Appointment");
        System.out.print("\n3. Shopping");

        System.out.print("\nEnter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int attempts = 0;
                int attempt =0;
                boolean success = false;

            while (attempts < 3 && !success) {   
                System.out.print("Enter your Account No: ");
                int accNo = sc.nextInt();
                
                if (banking.verifyAccount(accNo)) {;
                    
                    while (attempt < 3 && !success) {
                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();

                        if (banking.verifyPin(pin)) {
                            System.out.println("\nLOGIN SUCCESSFULLY! You are now logged in.");
                            success = true;
                        } else {
                            attempt++;
                            System.out.println("INVALID PIN! Attempt " + attempt + " of 3");
                        }
                    }
                    success = true;
                } else {
                    attempts++;
                    System.out.println("INVALID ACCOUNT NO.! Attempt " + attempts + " of 3");
                }
            }
                
                if (!success) {
                    System.out.println("\nAccount locked. Too many attempts. Come back tomorrow!");
                }
                break;

            case 2:
                System.out.println("Doctor's Appointment feature will be developed soon.");
                break;

            case 3:
                System.out.println("Shopping feature will be developed soon.");
                break;

            default:
                System.out.println("Invalid Selection!");
        }

        sc.close();
    }
}