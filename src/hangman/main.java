package hangman;

/**
 * @author reprise
 */
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
         gameform game0 = new gameform();
         game0.setVisible(true);
        
         WordShuffle game = new WordShuffle();
         
         String randomWord = game.doWordBag1();
         System.out.println("Word:" + randomWord);
        
        
    }
    
}
