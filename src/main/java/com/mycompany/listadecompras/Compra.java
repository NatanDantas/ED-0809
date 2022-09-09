public class Compra {
    private int item;
    private String nome;
    private double qtd;
    private double preco;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Compra() {
    }

    public Compra(int item, String nome, double qtd, double preco) {
        
        this.item = item;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    public void imprimir() {
        System.out.println("--------------------------------------");
        System.out.println(" Item: " + getItem() + "\n Produto: " + getNome() + "\n Quantidade: " + getQtd() + "\n Preço: "
                + getPreco());
        System.out.println("--------------------------------------");                
    }

        
    
}
