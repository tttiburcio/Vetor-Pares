package view;


import controller.VetorPares;

public class Principal {
    public static void main(String[] args) {

        VetorPares vetorPares = new VetorPares();

        int [] vetor = {1, 2, 4, 5, 1, 8, 12};

        int resultado = vetorPares.buscaPares(vetor, 0);

        System.out.println("Qtde. de pares no vetor: " +resultado);
    }
}