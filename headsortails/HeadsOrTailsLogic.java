package study.fifthpracticaltask.headsortails;

import java.util.Random;

public class HeadsOrTailsLogic {

    private static final int FLIP = 1000;

    static int amountOfHeads;
    static int amountOfTails;

    static int findRandomNumber(){
        int random = new Random().nextInt(2);
        return random;
    }

    static void countHeadORTail(){
        for (int i = 0; i < FLIP; i++){
            if (findRandomNumber() > 0){
                amountOfHeads++;
            }else{
                amountOfTails++;
            }
        }
    }

}
