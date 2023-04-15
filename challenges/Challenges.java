package challenges;

import java.util.Scanner;

import static challenges.colors.Colors.*;

public class Challenges {
    private Challenges() {
    }

    private void runTasks(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print(ANSI_PURPLE + "\n======== RESPOSTA ATIVIDADE N. 1 ========\n" + ANSI_RESET);
            ChallengeWhile.execute();
            Thread.sleep(3 * 1000);

            System.out.print(ANSI_PURPLE + "\n======== RESPOSTA ATIVIDADE N. 2 ========\n" + ANSI_RESET);
            System.out.print("\n\nDigete um numero inteiro para conferir se ele faz parte da sequencia fibonacci:");
            int value = sc.nextInt();
            ChallengeFibonacci.execute(value);
            Thread.sleep(3 * 1000);

            System.out.print(ANSI_PURPLE + "\n======== RESPOSTA ATIVIDADE N. 3 ========\n" + ANSI_RESET);
            ChallengeFindOutTheLogic.execute();
            Thread.sleep(3 * 1000);

            System.out.print(ANSI_PURPLE + "\n======== RESPOSTA ATIVIDADE N. 4 ========\n" + ANSI_RESET);
            ChallengeRibeiraoPretoToFrancaRoute.execute();
            Thread.sleep(3 * 1000);

            System.out.println(ANSI_PURPLE + "\n========== INVERSOR DE STRING ==========\n" + ANSI_RESET);
            System.out.print("\nDigite uma String no terminal:");
            String anyString = sc.next();
            ChallengeReverseString.execute(anyString);
        }catch (InterruptedException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void execute(){
        new Challenges().runTasks();
    }

}
