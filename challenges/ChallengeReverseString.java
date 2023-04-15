package challenges;

import static challenges.colors.Colors.*;

public class ChallengeReverseString {
    private ChallengeReverseString(){}
    private void newReverse(String anyString) {
        String newString = "";
        for(int i = anyString.length() - 1; 0 <= i; i--) {
            newString += anyString.charAt(i);
        }
        System.out.printf(ANSI_GREEN+"Você digitou a string:"+ANSI_CIANO+"' %s ',"
                        +ANSI_GREEN+"o inverso dela é: "+ANSI_CIANO+"' %s ' .\n"+ANSI_RESET,
                        anyString, newString);
    }

    public static void execute(String anyString) {
        new ChallengeReverseString().newReverse(anyString);
    }
}
