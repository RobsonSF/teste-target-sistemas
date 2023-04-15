package challenges;

import static challenges.colors.Colors.*;

public class ChallengeFindOutTheLogic {

    private String challenge = "\n\n3) Descubra a lógica e complete o próximo elemento: \n\n";
    public String challengeA = "a) 1, 3, 5, 7, "
            + ANSI_GREEN + " ( 9 ) => "
            + ANSI_CIANO
            +"Padrão sequencia de impares\n"+ ANSI_RESET;

    private String challengeB = "b) 2, 4, 8, 16, 32, 64, "
            + ANSI_GREEN + " ( 128 ) => "
            + ANSI_CIANO
            +"Padrão Potenciação do numero 2 => 2, 2², 2³, 2³ ...\n"+ ANSI_RESET;
    private String challengeC = "c) 0, 1, 4, 9, 16, 25, 36, "
            + ANSI_GREEN + " ( 49 ) => "
            + ANSI_CIANO
            +"Padrão Potenciação: numeros de 0 a 7 elevado ao quadrado\n"+ ANSI_RESET;
    private String challengeD = "d) 4, 16, 36, 64, "
            + ANSI_GREEN + " ( 100 ) => "
            + ANSI_CIANO
            +"Padrao Potenciação: numeros pares elevados ao quadrado  = > 2², 4², 6², 8², 10²\n"+ ANSI_RESET;
    private String challengeE = "e) 1, 1, 2, 3, 5, 8, "
            + ANSI_GREEN + " ( 13 ) => "
            + ANSI_CIANO
            +"Padrao Fibonacci\n"+ ANSI_RESET;
    private String challengeF = "f) 2,10, 12, 16, 17, 18, 19, "
            + ANSI_GREEN + " ( 200 ) => "
            + ANSI_CIANO
            +"Padrao numeros começados com a letra D\n"+ ANSI_RESET;

    private ChallengeFindOutTheLogic(){};

    private void challengeSolved() {
        System.out.println(
                    challenge
                    +challengeA
                    +challengeB
                    +challengeC
                    +challengeD
                    +challengeE
                    +challengeF
        );
    }
    public static void execute() {
        new ChallengeFindOutTheLogic().challengeSolved();
    }
}

