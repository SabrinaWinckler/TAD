package trabalhorelampago;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SABRINA
 */
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.ArrayList;
import java.util.Arrays;
import trabalhorelampago.Aerolito;
import trabalhorelampago.Nodo;

/**
 * Implementação clássica do MergeSort
 *
 * @author jeancheiran
 */
public class MergeSort {
    
    Aerolito[] lista;
    Aerolito[] auxiliar;

    public MergeSort() {
        this.lista = null;
        this.auxiliar = null;
    }

   
    
    public void sortList(ArrayList<Aerolito> aerolitoLista) {
        lista = aerolitoLista.toArray(new Aerolito[aerolitoLista.size()]);
        auxiliar = new Aerolito[lista.length];
        mergeSort(0, lista.length - 1);
        aerolitoLista = (ArrayList<Aerolito>) Arrays.<Aerolito>asList(lista);
    }

    private void mergeSort(int inicio, int ultimo) {
        if (inicio < ultimo) {
            int meio = inicio + (ultimo - inicio) / 2;
            mergeSort(inicio, meio); //sort left half
            mergeSort(meio + 1, ultimo); //sort right half
            merge(inicio, meio, ultimo); // merge
        }
    }

    private void merge(int inicio, int meio, int ultimo) {
        //This loop throws Exception
        for (int i = inicio; i <= ultimo; i++) {
            auxiliar[i] = lista[i];
        }

        int auxEsquerda = inicio;
        int auxDireita = meio + 1;
        int atual = inicio;

        /**
         * Iterate through helper array, copying back smaller element in the
         * original list
         */
        while (auxEsquerda <= meio && auxDireita <= ultimo) {
            if (auxiliar[auxEsquerda].compareTo(auxiliar[auxDireita]) < 1) {
                lista[atual] = auxiliar[auxEsquerda];
                auxEsquerda++;
            } else {
                lista[atual] = auxiliar[auxDireita];
                auxDireita++;
            }
            atual++;
        }

        while (auxEsquerda <= meio) {
            lista[atual] = auxiliar[auxEsquerda];
            atual++;
            auxEsquerda++;
        }

    }
}
