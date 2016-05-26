//Reprise

//This class is responsible for the word-bag logic. It will set up a random word for the user to guess based
//on the difficulty they chose in the begining before pressing "start Game" button. each bag has 25 words.

package hangman;
import java.util.Random;


public class WordShuffle {
    String wordToGuess;
    
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
       
        String WordBag2[]= new String[] {"shadow","continent","chocolate","rectangle","population","sandwich","bookcase","philosopher","dishonest","equipment",
                                         "generous","confusion","friendship","airplane","strawberry","information","continent","landscape","staircase","sneakers",
                                         "automobile","technician","climate","acceleration","mountain"};
        
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
                                         "","","","","","","","","","",
                                         "","","","",""};
        
        randomNumber = randomGenerator.nextInt(24); // from 0 to 24, is 25 entries.
        wordToGuess = WordBag3[randomNumber];
        System.out.println("Number: " + randomNumber);
        
        return wordToGuess;
    }
    //is the letter there?
    public boolean testLetterResponse(String letter){
        boolean isCorrectLetter = false;
        
        
        
        return isCorrectLetter;
    }
}