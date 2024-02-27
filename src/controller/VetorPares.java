package controller;

public class VetorPares {
    public VetorPares (){
        super();
    }
    public int buscaPares (int[] vetor, int indice){
        if(indice >= vetor.length){
            return 0;
        } else {
            if(vetor[indice] % 2 == 0){
                return 1 + buscaPares(vetor, indice + 1);
            }else{
                return buscaPares(vetor, indice + 1);
            }
        }
    }
}

