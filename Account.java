
package wenmo;
import java.util.Scanner;

public class Account {

    private String firstN;
    private String lastN;
    private String ad;
    
    private int n;
    private int ssn;
    private int ph;
    private int dob;
     
    private double withdraw;
    private double deposit;
    private double amount;
    Account a;
        
         public Account(String firsN) {
             this.firstN = firstN;
    
} 

        public Account(String firstN, String lastN,int n, int ssn,int ph,int dob,String ad ){
            this.firstN = firstN;
            this.lastN = lastN; 
            this.ssn = ssn;
            this.ph = ph;
            this.dob = dob;
            this.ad = ad;
        }
        public  void creat(){
            
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
               input = input.trim().toLowerCase(); 
               input = s.nextLine();
               firstN = input.trim().toUpperCase(); 
               System.out.println("Please type in your last name: ");
               input = s.nextLine();
               lastN = input.trim().toUpperCase();
               n = a.setN();              
               System.out.println("Pleasy type in your social security number :");
               input = s.nextLine();
               ssn = Integer.parseInt(input);
               System.out.println("Pleasy type in your day of birth: ");
               input = s.nextLine();
               dob = Integer.parseInt(input);
               System.out.println("Please type in your phone number :");
               input = s.nextLine();
               ph = Integer.parseInt(input);    
               System.out.print("Please type in your address :");
               input = s.nextLine();
               ad = input.trim().toUpperCase();  
               
             Account a = new Account( firstN,lastN,n,ssn,ph,dob,ad );
                

               System.out.println("You succesfully create your account.");
               System.out.println(a.getFirstN() + a.getLastN()+"\n"+
                                  "N 00" + n + "\n"+
                                  "Your social security number : " + a.getSsn()+"\n"+
                                  "Your day of Birth : " + a.getDob()+"\n"+
                                  "Your phone number : " + a.getPh()+"\n"+
                                  "Your address : " + a.getAd() + "\n"
                                  );
        }
        
         public void setFirstN(){
            this.firstN = firstN; 
         }
         public void setN(int i){
            this.n = i++; 
         }
         public void setSSN(){
            this.ssn = ssn; 
         }
         public void setPH(){
            this.ph = ph; 
         }
         public void setDOB(){
            this.dob = dob; 
         }
         public void setAD(){
            this.ad = ad; 
         }
         
         
         
         public String getFirstN(){
             return firstN;
         } 
         public String getLastN(){
             return lastN;
         } 
           public String getAd(){
             return ad;
         } 
         public int getN(){
             return n;
         }               
         public int getSsn(){
             return ssn;   
         }
         public int getDob(){
             return dob;   
         }
         public int getPh(){
             return ph;   
         }
  
         public void setWithdraw(double withdraw){
             this.withdraw = withdraw;
         }
         public void setDeposit(double deposit){
             this.deposit = deposit;
         }

         
         public double getWithdraw(){
             return withdraw;   
         }
         public double getDeposit(){
             return deposit;
         }

         public double amount(){
             amount += deposit;
             amount -= withdraw;
             return amount;
         }
                           
         
}


