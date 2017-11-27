package trabalhorelampago;

/**
 * Essa classe pode implementar qualquer tipo de lista, desde que execute
 * adequadamente o comportamento dos métodos estabelecidos.
 *
 * @author Jean
 */
public class Lista {

    public Nodo primeiro;
    public Nodo ultimo;

    public Lista() {
        primeiro = null;
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    /**
     * Método que adiciona um novo elemento na lista.
     */
    public void adicionar(Aerolito a) {
        Nodo novo = new Nodo(a);
        novo.proximo = primeiro;
        primeiro = novo;
//        Nodo nodo = new Nodo(a);
//        if (this.primeiro == null) {
//            this.primeiro = nodo;
//            this.ultimo = nodo;
//        } else {
//            Nodo outro = this.primeiro;
//            while (outro.proximo != null) {
//                outro = outro.proximo;
//
//            }
//            outro.proximo = nodo;
//            this.ultimo = nodo;
//
//        }

    }

    public void resulta(Nodo resultado) {
        primeiro = resultado;
    }

    /**
     * Método que remove da lista TODOS os aerolitos com o nome indicado.
     *
     * @param nome
     */
    public void remover(String nome) {
        Nodo atual = this.primeiro;
        if (atual.objeto.nome.equalsIgnoreCase(nome)) {
            Nodo antigoPrimeiro = this.primeiro;
            this.primeiro = antigoPrimeiro.proximo;
        }
        while (atual != null) {
            if (atual.proximo.objeto.nome.equalsIgnoreCase(nome)) {
                atual.proximo = atual.proximo.proximo;
            }
            atual = atual.proximo;
        }
    }

    /**
     * Método que retorna os aerolitos do menor para o maior.
     *
     * @return String lista de aerolitos que segue o seguinte formato:
     *
     * 1) cada aerolito será mostrado com seu nome entre colchetes, por exemplo:
     * [Aeroberto]
     *
     * 2) o String retornado terá todos os aerolitos sem qualquer separador, por
     * exemplo: [Aeroan][Aeroberto][Aerowski]
     *
     */
    public void mostrar() {
        Nodo atual = primeiro;
        while (atual != null) {
            atual.mostrarNodo();
            atual = atual.proximo;
        }
        System.out.println("");

//        merge(this.primeiro, this.primeiro.proximo);
//        String aerolito = "";
//        if (this.primeiro == null) {
//            aerolito = "";
//        } else {
//            Nodo atual = this.primeiro;
//            while (atual != null) {
//                aerolito += atual.objeto.toString() + " ";
//                atual = atual.proximo;
//            }
//        }
//        return aerolito;
    }

    public Nodo extraiPrimeiro() {
        return primeiro;
    }

    public Nodo mergeSort(Nodo original) {
        if (original == null || original.proximo == null) {
            return original;
        }
        Nodo a = original;
        Nodo b = original.proximo;
        while ((b != null) && (b.proximo != null)) {
            original = original.proximo;
            b = (b.proximo).proximo;
        }
        b = original.proximo;
        original.proximo = null;
        return merge(mergeSort(a), mergeSort(b));
    }

    public Nodo merge(Nodo a, Nodo b) {
        Nodo temp = new Nodo();
        Nodo primeiro = temp;
        Nodo c = primeiro;
        while ((a != null) && (b != null)) {
            if (a.objeto.altura <= b.objeto.altura) {
                c.proximo = a;
                c = a;
                a = a.proximo;
            } else {
                c.proximo = b;
                c = b;
                b = b.proximo;
            }
        }
        c.proximo = (a == null) ? b : a;
        return primeiro.proximo;
    }
}

//    public Nodo nodeSort(Nodo inicioOriginal) 
//    {
//        if (inicioOriginal == null || inicioOriginal.proximo == null)
//            return inicioOriginal;
//        Nodo a = inicioOriginal;
//        Nodo b = inicioOriginal.proximo;
////        while ((b != null) && (b.proximo != null)) 
////        {
////            inicioOriginal = inicioOriginal.proximo;
////            b = (b.proximo).proximo;
////        }
////        b = inicioOriginal.proximo;
////        inicioOriginal.proximo = null;
//       // return merge(nodeSort(a), nodeSort(b));
//    }
//    public void merge(Nodo a, Nodo b) 
//    {
//        Nodo c = new Nodo(a.objeto);
//        //Nodo inicio = c;
//        //Nodo inicio = temp;
//        
//        while (b != null) 
//        {
//            if (a.objeto.altura > b.objeto.altura) 
//            {
//                c = b.proximo;
//                b.proximo = a;
//                a.proximo = c;
//                c = b;
//                b = a;
//                a =c ;
//            }
//            else 
//            {
//                a = b;
//                b = b.proximo;
//                
//            }
//        }
//       // c.proximo = (a == null) ? b : a;
//      //  return inicio.proximo;
//    }

