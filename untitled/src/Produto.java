public class Produto {

    //atributos da classe Produto
    private int codigo;
    private String nome;
    private int qtdEstoque;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        //instanciando
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void entradaEstoque(int quantidade) {
        if (quantidade > 0) {
            qtdEstoque += quantidade;
        }
    }

    public boolean saidaEstoque(int quantidade) {
        if (quantidade > 0 && qtdEstoque >= quantidade) {
            qtdEstoque -= quantidade;
            return true;
        }
        return false;
    }

    //emitir relatório
    public String emitirRelatorio() {
        return "Código: " + codigo + "\nNome: " + nome + "\nQuantidade em Estoque: " + qtdEstoque + "\nPreço: R$" + preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto(1, "Produto ", 9.99);
        produto.entradaEstoque(50);

        if (produto.saidaEstoque(30)) {
            System.out.println("Saiu 30 unidades do estoque.");
        } else {
            System.out.println("Não foi possível realizar a saída do estoque!");
        }

        System.out.println(produto.emitirRelatorio());
    }
}
