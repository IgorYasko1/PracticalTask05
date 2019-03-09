package study.fifthpracticaltask.headsortails;

import java.util.Random;

public class HeadsOrTailsLogic {

    private static final int FLIP = 1000;

    static int amountOfHeads;
    static int amountOfTails;

    static boolean findRandomNumber(){
        boolean random = new Random().nextBoolean();
        return random;
    }

    static void countHeadORTail(){
        for (int i = 0; i < FLIP; i++){
            if (findRandomNumber()){
                amountOfHeads++;
            }else{
                amountOfTails++;
            }
        }
    }

}
