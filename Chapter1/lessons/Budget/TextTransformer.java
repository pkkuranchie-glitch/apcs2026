

/**
 * Transform a string
 *
 * Prince.K
 * @Last Updated: 9/02/2026
 */

import java.util.Scanner;

public class TextTransformer
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Text Transformer!");
        System.out.println("============================");
        
        System.out.print("Enter a motivational quote: ");
        String phrase = scan.nextLine();
        
        // The length method return the number of characters in the String as an integer
        int phraseLength = phrase.length();
        System.out.println("Total Characters (Including Spaces): " + phraseLength);
        
        // The replace method returns a new version of the old String
        // and replaces the first character with the second character
        // The original String is NOT modified
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase);
        
        // Get the first 5 characters of our String
        // Example: You miss 100% of the shots you don't take.
        // Index #: 0123456789...
        // Substring returns a String from the first index number (inclusive)
        // to the second index number (exclusive)
        // prefix = You m
        String prefix = phrase.substring(0, 5);
        System.out.println("First 5 Characters: " + prefix);
        
        
        
        // Returns a String from the given index (inclusive)
        // to the end of the original String
        String remainder = phrase.substring(5);
        System.out.println("Remaining Characters: " + remainder);
        
        
        
        
    }
}