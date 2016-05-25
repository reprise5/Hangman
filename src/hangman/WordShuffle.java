//Reprise

//This class is responsible for the word-bag logic. which will set up a random word for the user to guess based
//on the difficulty they chose in the begining. each bag has 25 words.

package hangman;
import java.util.Random;


public class WordShuffle {
    
    
    public String doWordBag1(){
        String wordToGuess = "";
        int randomNumber = 0;
        Random randomGenerator = new Random();
       
        String WordBag1[]= new String[] {"whale","joy", "spirit","court","trees","dream","dozen","mouse","games","book","ocean","watch","school","beach",
                                         "money","pond","moon","stars","elbow","nurse","belief","peace","farmer","garden","love"};
        
        randomNumber = randomGenerator.nextInt(24); // from 0 to 24, is 25 entries.
        wordToGuess = WordBag1[randomNumber];
        System.out.println("Number: " + randomNumber);
        
        return wordToGuess;
    }
    
    
    
    
    
    
    
    
    
    
    
    
        public String doWordBag2(){
        String wordToGuess = "";
        double randomNumber = Math.random() * 25 + 1;
        
        
        return wordToGuess;
    }
        
        public String doWordBag3(){
        String wordToGuess = "";
        double randomNumber = Math.random() * 25 + 1;
        
        
        return wordToGuess;
    }
    
}
