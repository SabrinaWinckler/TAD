package trabalhorelampago;

/**
 * Estrutura auxiliar da lista
 * @author Jean
 */
public class Nodo {
    
    public Aerolito objeto;
    public Nodo proximo;

    public Nodo(Aerolito objeto) {
        this.objeto = objeto;
        this.proximo = null;
    }
    
    public Nodo() {
    
    }
    
    public void mostrarNodo() {
        System.out.print("[" + objeto.nome + "] ");
    }
}
