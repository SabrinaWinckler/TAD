/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author SABRINA
 */

import java.util.Arrays;

/**
 * Implementação clássica do MergeSort
 * @author jeancheiran
 */
public class MergeSort {
    public static void main(String[] args) {
        /* vetor criado por uma lista inicializadora */
        int[] vetor = {5, 7, 12, 1, 15, 2, 16, 7, 9, 4, 2};

        System.out.println(Arrays.toString(vetor));

        MergeSort.classificar(vetor, 0, vetor.length - 1);

        System.out.println(Arrays.toString(vetor));
    }
    
    public static void classificar(int[] vetor, int comeco, int fim) {
        if(comeco < fim){ //se o tamanho é ao menos 2
            int meio = (comeco + fim) / 2;
            MergeSort.classificar(vetor, comeco, meio);
            MergeSort.classificar(vetor, meio + 1, fim);
            MergeSort.misturar(vetor, comeco, meio, fim);
        }
    }
    
    public static void misturar(int[] vetor, int comeco, int meio, int fim){
        int tamanhoVetorEsquerda = meio - comeco + 1;
        int tamanhoVetorDireita = fim - meio;
        
        int[] vetorEsquerda = new int[tamanhoVetorEsquerda];
        int[] vetorDireita = new int[tamanhoVetorDireita];
        
        //criar subvetores
        for(int i = 0; i < tamanhoVetorEsquerda; i++){
            vetorEsquerda[i] = vetor[comeco + i];
        }
        for(int j = 0; j < tamanhoVetorDireita; j++){
            vetorDireita[j] = vetor[meio + 1 + j];
        }
        
        int i=0, j=0;
        
        int k = comeco;
        
        //se há elementos nos dois subvetores
        while(i < tamanhoVetorEsquerda && j < tamanhoVetorDireita){ 
            if(vetorEsquerda[i] <= vetorDireita[j]){ //puxa do vetor da esquerda
                vetor[k] = vetorEsquerda[i];
                i++;
            }else{ //puxa do vetor da direita
                vetor[k] = vetorDireita[j];
                j++;
            }
            k++;
        }
        
        while(i < tamanhoVetorEsquerda){ //copia o resto do vetor da esquerda
            vetor[k] = vetorEsquerda[i];
            i++;
            k++;
        }
        
        while(j < tamanhoVetorDireita){ //copia o resto do vetor da direita
            vetor[k] = vetorDireita[j];
            j++;
            k++;
        }
    }
}
