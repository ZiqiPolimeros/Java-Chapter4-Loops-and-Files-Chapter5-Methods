
package wenmo;

import java.util.Scanner;

public class Wenmo {

    public static void main(String[] args) {
        String input;
        String firstN;
        String lastN;
        String ad;
    
        int n;
        int ssn;
        int ph;
        int dob;
        
        String y;
        
        double deposit;
        double withdraw;
        int i = 0;
        Account a;
        
        
        
        
        
        System.out.print("Welcom to Wenmo Bank!\n" +
                         "Do you want to create a new account, deposit or withdraw?"
                         );
        Scanner s = new Scanner(System.in);
        input = s.nextLine();
        input = input.trim().toLowerCase();
        
         

        if(input.equals("create")){
                a.creat();
        }else if(input.equals("deposit")){
                   System.out.println("You are deposit $");
                   input = s.nextLine();
                   input = input.trim();
                   deposit = Integer.parseInt(input);

                   System.out.println("Your account has $ " + a.amount());
                      
        }else if(input.equals("deposit")){
                   System.out.println("You are deposit $");
                   input = s.nextLine();
                   input = input.trim();
                   deposit = Double.parseDouble(input);
                   a.setDeposit()= deposit;

                   System.out.println("Your account has $ " + a.amount());
        }else if(input.equals("withdraw")){
                   System.out.println("You are withdraw $");
                   input = s.nextLine();
                   input = input.trim();
                   withdraw = Double.parseDouble(input);
                   
                   
                   if(withdraw > a.amount()){
                       System.out.println("You don't have enough money in your account!\n"+
                                          "System is exiting...");
                       System.exit(0);
                   }else{
                   withdraw = a.setWithdraw(10.0);
                   System.out.println("Your account has $ " + a.amount());
                   System.exit(0);

               }
            
    }
    }
    
}
