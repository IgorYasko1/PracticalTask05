package study.fifthpracticaltask.perfectnumber;

public class PerfectNumberChecker {

    public static boolean checkPerfectNumber(final int num){
        int sum = 0;

        for (int d = num / 2; d >= 1; d--){
            if (num % d == 0){
                sum += d;
            }
        }

        return num == sum;
    }

}
