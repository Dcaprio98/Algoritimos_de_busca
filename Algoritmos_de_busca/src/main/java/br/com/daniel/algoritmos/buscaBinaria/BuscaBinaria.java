package br.com.daniel.algoritmos.buscaBinaria;

import br.com.daniel.algoritmos.ordenamento.QuickSort;

import java.util.Objects;

public class BuscaBinaria {
    public boolean buscar(double chave, double[] vetor) {
        var quickSort = new QuickSort();
        quickSort.quickSort(vetor, 0, vetor.length - 1);
        int posInicial = 0;
        int posFinal = vetor.length - 1;
        boolean valorEncontrado = false;

        while (posInicial <= posFinal) {
            int posMeio = (int) ((posInicial + posFinal) / 2);
            if (Objects.equals(vetor[posMeio], chave)) {
                valorEncontrado = true;
                break;
            }
            if (vetor[posMeio] > chave) {
                posFinal = posMeio - 1;
            }
            if (vetor[posMeio] < chave) {
                posInicial = posMeio + 1;
            }
        }
        return valorEncontrado;
    }
}