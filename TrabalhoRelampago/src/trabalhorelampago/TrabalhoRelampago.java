/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhorelampago;

/**
 *
 * @author SABRINA
 */
public class TrabalhoRelampago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        Aerolito a1 = new Aerolito("teobaldo", 4, 12, 5);
        Aerolito a2 = new Aerolito("teo", 3, 12, 5);
        Aerolito a3 = new Aerolito("baldo", 7, 12, 5);
        Aerolito a4 = new Aerolito("obaldo", 2, 12, 5);
        Aerolito a5 = new Aerolito("teoba", 1, 12, 5);

        lista.adicionar(a1);
        lista.adicionar(a2);
        lista.adicionar(a3);
        lista.adicionar(a4);
        lista.adicionar(a5);

        System.out.println("Lista antes de ordenar :");
        lista.mostrar();
        lista.resulta(lista.mergeSort(lista.extraiPrimeiro()));
        System.out.println("Lista depois de ordenar :");
        lista.mostrar();

        //lista.nodeSort(lista.primeiro);
       // System.out.println(lista.mostrar());
    }

}
