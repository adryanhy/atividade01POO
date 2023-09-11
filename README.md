# Tarefa 001 de Programação Orientada a Objetos

Este repositório contém uma tarefa de Programação Orientada a Objetos (POO) que aborda conceitos fundamentais e práticos dessa disciplina. 

# Especificações do Exercício

Classe Produto

A classe Produto deve ter os seguintes atributos privados:

· codigo: inteiro que representa o código do produto.
· nome: string que representa o nome do produto.
· quantidade: inteiro que representa a quantidade atual do produto em estoque.
· preco: double que representa o preço unitário do produto.

· A classe deve ter um construtor que inicializa codigo, nome e preco. A quantidade deve ser inicializada como 0.

· A classe deve ter métodos getters e setters para todos os atributos.

· A classe deve ter os seguintes métodos:

· entradaEstoque(int quantidade): aumenta a quantidade em estoque.
· saidaEstoque(int quantidade): diminui a quantidade em estoque se houver quantidade suficiente.
· emitirRelatorio(): retorna uma string contendo todos os detalhes do produto.

Classe EstoqueGerenciar

A classe EstoqueGerenciar deve ter uma lista de produtos (ArrayList<Produto>).

O método main deve conter um menu para:

· Cadastrar um novo produto.

· Realizar entrada de mercadoria.

· Realizar saída de mercadoria.

· Consultar informações de um produto.

· Mostrar o relatório de todos os produtos.

· Sair do programa.

· A classe deve ter métodos separados para cada uma das funcionalidades do menu. 

## Como Usar

1. Clone este repositório:

   ```bash
   git clone (https://github.com/adryanhy/atividade01POO)
