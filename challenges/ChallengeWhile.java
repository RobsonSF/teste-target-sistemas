package challenges;

import static challenges.colors.Colors.*;

public class ChallengeWhile {
    private int index;
    private int sum;
    private int k;

    private ChallengeWhile() {
        this.index = 13;
        this.sum = 0;
        this.k = 0;
    }

    private void printResult(){
        while (k < index) {
            k +=1;
            sum += k;
        }
        System.out.print(ANSI_GREEN + "O Resultado de SOMA é: "+ ANSI_CIANO + sum + ANSI_RESET +"\n\n");
    }
    private void challengeText(){
        System.out.println("""
                \n\n1) Observe o trecho de código abaixo:
                                
                int INDICE = 13, SOMA = 0, K = 0;
                enquanto K < INDICE faça
                {
                    K = K + 1;
                    SOMA = SOMA + K;
                }
                imprimir(SOMA);
                """);
    }

    public static void execute(){
        var challenge =  new ChallengeWhile();
        challenge.challengeText();
        challenge.printResult();
    }
}
