package br.com.daniel.algoritmos.arvoreBinaria;

public class ArvoreBinaria {
    No raiz;
    public void gerarArvore(double[] vetor) {
        for (double i: vetor) {
            adicionaNo(i);
        }
    }
    private No adicionaNoRecursivamente(No atual, double valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esq = adicionaNoRecursivamente(atual.esq, valor);
        } else if (valor > atual.valor) {
            atual.dir = adicionaNoRecursivamente(atual.dir, valor);
        } else {
            return atual;
        }
        return atual;
    }
    public void adicionaNo(double valor) {
        raiz = adicionaNoRecursivamente(raiz, valor);
    }

    private boolean buscarRecursivamente(No atual, double valor) {
        if (atual == null) {
            return false;
        }
        if (atual.valor == valor) {
            return true;
        }
        return valor < atual.valor
                ? buscarRecursivamente(atual.esq, valor)
                : buscarRecursivamente(atual.dir, valor);
    }
    public boolean buscar(double valor) {
        return buscarRecursivamente(raiz, valor);
    }
}