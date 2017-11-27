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

    }

    /**
     * Método que adiciona um novo elemento na lista.
     */
    public void adicionar(Aerolito a) {
        Nodo nodo = new Nodo(a);
        if (this.primeiro == null) {
            this.primeiro = nodo;
            this.ultimo = nodo;
        } else {
            Nodo outro = this.primeiro;
            while (outro.proximo != null) {
                outro = outro.proximo;

            }
            outro.proximo = nodo;
            this.ultimo = nodo;

        }

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
    public String mostrar() {
        merge(this.primeiro, this.primeiro.proximo);
        String aerolito = "";
        if (this.primeiro == null) {
            aerolito = "";
        } else {
            Nodo atual = this.primeiro;
            while (atual != null) {
                aerolito += atual.objeto.toString() + " ";
                atual = atual.proximo;
            }
        }
        return aerolito;
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
 
    public void merge(Nodo a, Nodo b) 
    {
        Nodo c = new Nodo(a.objeto);
        //Nodo inicio = c;
        //Nodo inicio = temp;
        
        while (b != null) 
        {
            if (a.objeto.altura > b.objeto.altura) 
            {
                c = b.proximo;
                b.proximo = a;
                a.proximo = c;
                c = b;
                b = a;
                a =c ;
            }
            else 
            {
                a = b;
                b = b.proximo;
                
            }
        }
       // c.proximo = (a == null) ? b : a;
      //  return inicio.proximo;
    }
}

