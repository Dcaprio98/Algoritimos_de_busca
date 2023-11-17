package br.com.daniel.algoritmos.ordenamento;


public class QuickSort {
    public void quickSort(double[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = dividirVetor(vetor, inicio, fim);

            quickSort(vetor, inicio, partitionIndex-1);
            quickSort(vetor, partitionIndex+1, fim);
        }
    }
    private int dividirVetor(double[] vetor, int inicio, int fim) {
        double pivot = vetor[fim];
        int i = inicio;
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivot) {
                trocarPosicao(vetor, i, j);
                i++;
            }
        }
        trocarPosicao(vetor, i, fim);
        return i;
    }
    private void trocarPosicao(double[] vetor, int a, int b) {
        double c = vetor[b];
        vetor[b] = vetor[a];
        vetor[a] = c;
    }
}
