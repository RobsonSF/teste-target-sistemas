package challenges;

import static challenges.colors.Colors.*;
public class ChallengeFibonacci {

    private int next;
    private int previous;
    private int current;

    private ChallengeFibonacci() {
        this.next = 0;
        this.previous = 0;
        this.current = 1;
    }

    private void valueContainsInFibonacci(int value) {
        for (int i = 0; i <= value; i++) {
            next = previous + current;
            previous = current;
            current =  next;
            if(previous == value){
                System.out.printf(ANSI_GREEN + "O valor digitado:"+ANSI_CIANO+" %s "
                        +ANSI_GREEN+" pertence a sequencia fibonacci.\n\n"+ANSI_RESET, value);
                return;
            }
            if(previous > value) {
                System.out.printf(ANSI_GREEN + "O valor digitado:"+ANSI_CIANO+" %s "
                        +ANSI_GREEN+"'NÃO' corresponde a um valor da sequencia fibonacci.\n\n"
                        +ANSI_RESET, value);
                return;
            }
        }
    }

    public static void execute(int value){
        new ChallengeFibonacci().valueContainsInFibonacci(value);
    }
}
