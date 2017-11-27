package trabalhorelampago;

/**
 * Essa classe não é uma Pedra!
 * @author Jean
 */
public class Aerolito {
    
    public String nome;
    public double altura;
    public double largura;
    public double comprimento;
    
    public Aerolito(String n, double a, double l, double c){
        this.nome = n;
        this.altura = a;
        this.largura = l;
        this.comprimento = c;
    }

    public double compareTo(Aerolito aerolito) {
        return aerolito.altura;
    }
    
    public String toString(){
        return "[" + this.nome + "]";
    }
}
