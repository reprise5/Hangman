//Reprise

//This class is responsible for the word-bag logic. It will set up a random word for the user to guess based
//on the difficulty they chose in the begining before pressing "start Game" button. each bag has 25 words.

package hangman;
import java.util.Random;


public class WordShuffle {
    //GLOBALS
    StringBuilder stringBuilder = new StringBuilder();
    String wordToGuess;
    String guesserScreen = "";
    int count = 0;
    
    //This is the "EASY" difficulty, random word generator
    public String doWordBag1(){
        wordToGuess = "";
        int randomNumber = 0;
        Random randomGenerator = new Random();
       
        String WordBag1[]= new String[] {"whale","joy", "spirit","court","trees","dream","dozen","mouse","cinema","book",
                                         "pond","moon","stars","elbow","nurse","belief","peace","farmer","garden","love",
                                         "ocean","watch","school","beach","money",};
        
        randomNumber = randomGenerator.nextInt(24); // from 0 to 24, is 25 entries.
        wordToGuess = WordBag1[randomNumber];
        System.out.println("Number: " + randomNumber);
        
        return wordToGuess;
    }
    //This is the "MEDIUM" difficulty, random word generator
    public String doWordBag2(){
        wordToGuess = "";
        int randomNumber = 0;
        Random randomGenerator = new Random();
       
        String WordBag2[]= new String[] {"centipede","continent","chocolate","rectangle","population","sandwich","exciting","philosopher","dishonest","equipment",
                                         "generous","confusion","friendship","airplane","strawberry","information","continent","landscape","staircase","zipper",
                                         "automobile","technician","arpeggio","acceleration","mountain"};
        
        randomNumber = randomGenerator.nextInt(24); // from 0 to 24, is 25 entries.
        wordToGuess = WordBag2[randomNumber];
        System.out.println("Number: " + randomNumber);
        
        return wordToGuess;
    }
    //This is the "HARD" difficulty, random word generator   
    public String doWordBag3(){
        wordToGuess = "";
        int randomNumber = 0;
        Random randomGenerator = new Random();
       
        String WordBag3[]= new String[] {"vociferous","extrapolate","tertiary","vicarious","ferrous","animosity","elucidate","phenomenon","circumnavigate","platitudinous",
                                         "sphynx","","","","","","","","","",
                                         "","","","",""};
        
        randomNumber = randomGenerator.nextInt(24); // from 0 to 24, is 25 entries.
        wordToGuess = WordBag3[randomNumber];
        System.out.println("Number: " + randomNumber);
        
        return wordToGuess;
    }
    //is the letter there?
    public boolean testLetterResponse(char letter){
        boolean isCorrectLetter = false;
        String sLetter = String.valueOf(letter); //converted char to string.
        
        isCorrectLetter = wordToGuess.contains(sLetter);
        
        //Send to console to see the result, the user will see it on their screen another way.
        System.out.print("Endered Letter: " + letter + " - ");
        if (isCorrectLetter){
            System.out.print("EXISTS\n");
        }
        else
            System.out.println("ABSENT");

        return isCorrectLetter;
    }
    
    public String getNewGuesserScreen(char letter){
        boolean containsLetter = false;
        //this sub will only be called by gameform.java if testLetterResponse returned true.
        //it is intended to return the new screen.  so if the word is cat, and the user pressed 'a',
        //it will return "_ a _".  it gets the PREVOUS version of this string (for updating it) here, it's a global.

        if (count == 0){
            //make the init underscore string.  count serves to test if this is a new game or not.
            for (int pos = 0; pos < wordToGuess.length(); pos++){
                stringBuilder.append("_ ");
                guesserScreen = stringBuilder.toString();
            }
            
            int index = 0;
            int replacerIndex = 0;
            int var = 0;
            
            index = wordToGuess.indexOf(letter);
            System.out.println("FirstInstanceIndex: " + index);
            replacerIndex = (index * 2) +1;
            //guesserScreen = guesserScreen.setCharAt(replacerIndex) ??  Replce at this index.
                
            //======================================================        I tried.
                char[] charArray = guesserScreen.toCharArray();
                //charArray[replacerIndex] = letter;
                guesserScreen = charArray.toString();
                System.out.println("New Screen: " + guesserScreen);
            //=======================================================
                
            while (index >= 0) {
                index = wordToGuess.indexOf(letter, index + 1);
                System.out.println("NextInstanceIndex: " + index);
                
                if (index != -1){
                    replacerIndex = (index * 2) +1;
                    //guesserScreen = guesserScreen.Replace(replacerIndex)? *replace at this index code here*
                }
            }
        }
        
        else{ 
            int index = 0;
            int replacerIndex;
            int var = 0;
            
            index = wordToGuess.indexOf(letter);
            System.out.println("FirstInstanceIndex: " + index);
            //replacerIndex = (index * 2) +1;
            //guesserScreen = guesserScreen.Replace(replacerIndex)? *replace at this index code here*
           
            while (index >= 0) {
                index = wordToGuess.indexOf(letter, index + 1);
                System.out.println("NextInstanceIndex: " + index);
                
                if (index != -1){
                    replacerIndex = (index * 2) +1;
                    //guesserScreen = guesserScreen.Replace(replacerIndex)? *replace at this index code here*
                }
            }
            ///....I have some idea how to write this sub...
        }
        
        //======================================================================================
        
       
        count++;
        return guesserScreen;
    }
    public void resetCount(){
        count = 0;
    }
}