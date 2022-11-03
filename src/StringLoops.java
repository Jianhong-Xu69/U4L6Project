
public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!
       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString)
    {
        int count = 0;
        String tempString = "";
        for (int i = 0; i < searchString.length(); i++)
        {
            tempString = String.valueOf(searchString.charAt(i));
            if (tempString.equals(character))
            {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString)
    {
        String tempString = "";
        for (int i = (origString.length()-1); i >= 0; i--)
        {
            tempString += String.valueOf(origString.charAt(i));
        }
        return tempString;
    }
    // --- FIVE NEW METHODS TO ADD & IMPLEMENT ARE BELOW ---

    /* Returns the original string reversed -- SECOND IMPLEMENTATION

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString2(String origString)
    {
   /* to be implemented*/
        return "Temp";
    }
    /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
    matches should NOT be case sensitive.*/

    public int countVowels(String origString)
    {
        /* to be implemented */
        return 0;
    }
    /* Returns the number of times "searchString" appears in "origString";
     matches should NOT be case sensitive.*/
    public int countString(String searchString, String origString)
    {
        /* to be implemented */
        return 0;
    }
    /* Returns a String with all instances of "searchString" removed from "origString";
     matches SHOULD be case sensitive (i.e no need to convert to lowercase)*/

    public String removeString(String searchString, String origString)
    {
        /* to be implemented */
        return "temp";
    }
    /* Returns a String with all instances of "searchChar" in "origString" replaced with
   "replaceChar"; matches SHOULD be case sensitive.
  PRECONDITION:
      both searchChar and replaceChar are single characters, and they are not equal*/
    public String replaceCharacter(String searchChar, String origStr, String replaceChar)
    {
        /* to be implemented */
        return "temp";
    }

}