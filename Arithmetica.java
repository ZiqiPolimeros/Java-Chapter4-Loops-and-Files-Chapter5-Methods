
package arithmetica;
import java.util.Scanner;

public class Arithmetica {

    public static void main(String[] args) {
        String a;
        
        System.out.println("If you want to calculate square of a number,please type in \"square(number)\".\n "+
                           "If you want to calculate four times a number, please type in \"quadruple(number)\".\n" +
                           "If you want to calculate the quotion and remainder of an integer, please type in \"divisionWithR(integer)\".\n"+
                           "If you want to convert centimeter to feet and inches, please type in \"centimetersToFeetAndInches(number)\".\n"
                           );  
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        double inputAsDouble = Double.parseDouble(a);
        int inputAsInt = Integer.parseInt(a);
       
        System.out.println("Square of the number is " + square(inputAsDouble));
        System.out.println("Four times of the number is " + quadruple(inputAsDouble));
        System.out.println("The division of the number is "+ divisionWithR(inputAsInt, 3));
        System.out.println("It's " + centimetersToFeetAndInches(inputAsDouble));
        
    }
    
        public static double square(double x){
		return (x*x);
               
	}
        public static double quadruple(double y){
                return y*4;
               
        }
        public static String divisionWithR(int int1, int int2){
                int q = int1/int2;
                int r = int1%int2;
                return q + "R" +r;
                
        }
        public static String centimetersToFeetAndInches(double centimeter){
                double feet = centimeter / 30.48;
                double inch = (centimeter - feet * 30.48)/2.54;
                return feet + "feet" + inch +"inch";
                
        }
}
