
/**
 * @Prince K            
 * @8 /31/2026
 */

import java.util.Scanner;

public class TextTransformer
{
   public static void main(String[] args) {
       Scanner Scan = new Scanner(System.in);
       System.out.println("Welcome to text Transformer!");
       System.out.println("============================");
       
       int phraseLength = phrase.length();
       // The length method return the number of characters in
       System.out.print("Enter a motivational quote:");
       int phraseLength =  phrase.length();
       
       System.out.println("Total Characters (Including Spaces): " + phraseLength);
       
       String securePhrase = phrase.replace('e','3');
       securePhrase = securePhrase.replace('a', '@');
       
       System.out.println("Modified Phrase " + securePhrase);
       System.out.println("Original Phrase: " + phrase);
       
       String prefix = phrase.substring(0,5);
       System.out.println("First 5 Characters: " + prefix);
       
       
       String remainder = phrase.substring(5);
       
   }
}
