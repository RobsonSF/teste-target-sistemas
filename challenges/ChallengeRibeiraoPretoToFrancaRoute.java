package challenges;

import static challenges.colors.Colors.*;

public class ChallengeRibeiraoPretoToFrancaRoute {

    private String question = "\n\n4 - Dois veículos (um carro e um caminhão) saem respectivamente \n" +
            "de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, \n" +
            "a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto \n" +
            "a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais \n" +
            "próximo a cidade de Ribeirão Preto?\n\n";

    private String paramA = "a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.\n";
    private String paramB = "b) Considerar 2 pedágios como obstáculo \n" +
            "e que o caminhão leva 5 minutos a mais para passar em cada \n" +
            "um deles e o carro possui tag de pedágio (Sem Parar)\n";
    private String paramC = "c) Explique como chegou no resultado.\n\n";
    private String answer = "Resposta: "+ANSI_CIANO+"Ambos estaram a mesma distancia de Ribeirão Preto, \n" +
            "pois eles estaram no mesmo ponto da estrada, porem em sentidos opostos\n"+ANSI_RESET;
    private ChallengeRibeiraoPretoToFrancaRoute() {}
    private void challengeSolved() {
        System.out.println(
                question
                +paramA
                +paramB
                +paramC
                +answer

        );
    }
    public static void execute(){
        new ChallengeRibeiraoPretoToFrancaRoute().challengeSolved();
    }
}
