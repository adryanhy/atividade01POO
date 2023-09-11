//Importando libs
import java.util.ArrayList;
import java.util.Scanner;


public class EstoqueGerenciar {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    realizarEntrada();
                    break;
                case 3:
                    realizarSaida();
                    break;
                case 4:
                    consultarProduto();
                    break;
                case 5:
                    mostrarRelatorio();
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar, saindo do programa...");
                    break;
                default:
                    System.out.println("Amigo, opção inválida. Tente novamente!");
            }
        } while (opcao != 6);
    }

    private void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("(1) Cadastrar um novo produto");
        System.out.println("(2) Realizar entrada de mercadoria");
        System.out.println("(3) Realizar saída de mercadoria");
        System.out.println("(4) Consultar informações de um produto");
        System.out.println("(5) Mostrar o relatório de todos os produtos");
        System.out.println("(6) Sair do programa");
        System.out.println("Escolha uma opção:");
    }

    private void cadastrarProduto() {
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        Produto produto = new Produto(codigo, nome, preco);
        produtos.add(produto);
        System.out.println("Produto cadastrado!");
    }

    private void realizarEntrada() {
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade a ser adicionada:");
        int quantidade = scanner.nextInt();

        Produto produtoEncontrado = encontrarProdutoPorCodigo(codigo);
        if (produtoEncontrado != null) {
            produtoEncontrado.entradaEstoque(quantidade);
            System.out.println("Entrada de mercadoria realizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private void realizarSaida() {
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade a ser retirada:");
        int quantidade = scanner.nextInt();

        Produto produtoEncontrado = encontrarProdutoPorCodigo(codigo);
        if (produtoEncontrado != null) {
            if (produtoEncontrado.saidaEstoque(quantidade)) {
                System.out.println("Saída de mercadoria realizada com sucesso!");
            } else {
                System.out.println("Quantidade insuficiente em estoque :( ");
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private void consultarProduto() {
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        Produto produtoEncontrado = encontrarProdutoPorCodigo(codigo);
        if (produtoEncontrado != null) {
            System.out.println(produtoEncontrado.emitirRelatorio());
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private Produto encontrarProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    private void mostrarRelatorio() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto.emitirRelatorio());
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        EstoqueGerenciar estoque = new EstoqueGerenciar();
        estoque.iniciar();
    }
}
