# Hangman
classic graphical Hangman game written in Java.  
when a letter is pressed on the keypad, it is deactivated so that you know which letters were already used.
if the guess is right, it fills every instance of the letter into the blanks by flipping a tile based on its position in the word.
if they're wrong, it'll decrease a counter, and change the hangman image to add a limb.  if you lose, the whole board disables itself until you click "New Game".
it choses words based on the index of the difficulty combo box.

There are 25 words to a difficulty, and they're hard coded into an array in the WordShuffle class.
Based on how I coded the rest of the game, words really can't exceed 12 characters unless more cases are added to a few subroutines that
work based on how long the word is.  if more than 25 words are to be added, the random number generator needs to include a higher range so new words will be shuffled.

I'm still trying to compact it more by throwing more code into subroutines.  The letter buttons alone can gurantee that a piece of code is executed 26 times alone.

####How To Win

- flip every tile by guessing all of the letters using the keypad.
- Correctly guess the word in the word box.
- Cheating off the console.

####How To Lose
- Make a wrong keypad guess more than 6 times, without flipping all of the tiles.
- Guess the word wrong 6 times.
- A combination of the two.

It's hangman.  who doesn't know how to play hangman, really.

####I'm not a developer, I just want to play.
I built the program into an executable .jar.  All you need to do is download this repository, go to the `dist` folder, and run `hangman.jar` 
with your JRE. (which you need to have installed first).
