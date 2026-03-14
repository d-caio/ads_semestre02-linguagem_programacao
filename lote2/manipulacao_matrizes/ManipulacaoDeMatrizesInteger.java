package lote2.manipulacao_matrizes;

import java.util.concurrent.ThreadLocalRandom;

public class ManipulacaoDeMatrizesInteger extends ManipulacaoDeMatrizesNumericas<Integer> {
    public ManipulacaoDeMatrizesInteger(int numDeLinhas, int numDeColunas, int vlrMinDosItens, int vlrMaxDosItens) {
        super(Integer.class, numDeLinhas, numDeColunas);

        Integer[][] matriz = getMatriz();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Integer item = ThreadLocalRandom.current().nextInt(vlrMinDosItens, vlrMaxDosItens + 1);

                adicionarItem(i, j, item);
            }
        }
    }

    @Override
    public Integer[] SomaVetorialDaMatriz(int indiceDeReferencia, int indiceIterador, boolean isLinha) {
        Integer[][] matriz = getMatriz();

        Integer[] somaVetorial = new Integer[indiceDeReferencia];

        for (int i = 0; i < indiceDeReferencia; i++) {
            Integer soma = 0;

            for (int j = 0; j < indiceIterador; j++) {
                if (isLinha)
                    soma += matriz[i][j].intValue();
                
                else
                    soma += matriz[j][i].intValue();

            }

            somaVetorial[i] = soma;
        }

        return somaVetorial;
    }

    @Override
    public Integer somaDaMatriz() {
        Integer[][] matriz = getMatriz();
        
        Integer soma = 0;

        for (Integer[] vetor:matriz)
            for (Integer num:vetor)
                soma += num.intValue();

        return soma;
    }
}
