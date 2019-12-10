
package dictionary;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        String input = "";
        Scanner s = new Scanner(System.in);
        Word w1 = new Word("a", "noun, plural A's or As, a's or as.\n", "This word has no synonyms\n", "This word has no antonyms");
        Word w2 = new Word("triangle","noun \n a closed plane figure having three sides and three angles.", "This word has no synonyms\n", "This word has no antonyms");
        Word w3 = new Word("have","verb \n (used with object), present singular 1st person have, 2nd have or (Archaic) hast, 3rd has or (Archaic) hath, present plural have;\n past singular 1st person had, 2nd had or (Archaic) hadst or had·dest, 3rd had, past plural had; \n past participle had; present participle hav·ing. \n to possess; own; hold for use; contain: ","Synonyms are obtain, gain, secure, procure.","Antonym is lack.");                           
        Word w4 = new Word("three","noun\n a cardinal number, 2 plus 1.\n a symbol for this number, as 3 or III.\n a set of this many persons or things.\n a playing card, die face, or half of a domino face with three pips.","This word has no synonyms\n", "This word has no antonyms");
        Word w5 = new Word("side", "noun\n one of the surfaces forming the outside of or bounding a thing, or one of the lines bounding a geometric figure.\n either of the two broad surfaces of a thin, flat object, as a door, a piece of paper, etc.\n one of the lateral surfaces of an object, as opposed to the front, back, top, and bottom.","SYNONYMS FOR side\n minor, lesser. \n","This word has no antonyms.");
        
       System.out.println("Welcome to Dictionary!\n"+
                          "Dictionary is in a test phase and only have five words.\n"+
                          "There are: \"a \", \"trangle\",\"have\",\"three\", \"side\"."+
                          "Type in each word above and you can read it's definition, synonyms ande antonyms. \n"+
                          "If you want to quit the program, please type in \"I'm done\"." 
                          );
       input = s.nextLine();
       input = input.trim().toLowerCase();
                   
        while(!input.equals("i'm done")){
            System.out.println(
                          "Dictionary is in a test phase and only have five words.\n"+
                          "There are: \"a \", \"trangle\",\"have\",\"three\", \"side\"."
                               );
            input = s.nextLine();
            input = input.trim().toLowerCase();
            
            if(input.equals(w1.getName())){
                System.out.println(w1);
            }else if(input.equals(w2.getName())){
                System.out.println(w2);
            }else if(input.equals(w3.getName())){
                System.out.println(w3);
            }else if(input.equals(w4.getName())){
                System.out.println(w4);
            }else if(input.equals(w5.getName())){
                System.out.println(w5);
            }
           
    }
}
}   


       
      
