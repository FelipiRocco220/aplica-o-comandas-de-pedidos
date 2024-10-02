import java.util.ArrayList;
import java.util.List;

class Cliente {
    private int id;
    private String nome;
    private String numero;
    private String cpf;

    public Cliente(int id, String nome, String email, String telefone, String rua, String numero, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCpf() {
        return cpf;
    }
}

class EnderecoCliente {
    private int id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private Cliente cliente;
    private List<Pedido> pedidos;

    public EnderecoCliente(int id, String rua, String numero, String bairro, String cidade, String estado, String cep,
            Cliente cliente) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.cliente = cliente;
        this.pedidos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}

class Pedido {
    private int id;
    private int idCliente;
    private int total;
    private int produtoQuantidade;

    public Pedido(int id, int idCliente, int total, int produtoQuantidade) {
        this.id = id;
        this.idCliente = idCliente;
        this.total = total;
        this.produtoQuantidade = produtoQuantidade;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getTotal() {
        return total;
    }

    public int getProdutoQuantidade() {
        return produtoQuantidade;
    }
}

class Item {
    private int id;
    private Produto produto;
    private int quant;
    private int valor;
    private Pedido pedido;

    public Item(int id, Produto produto, int quant, int valor, Pedido pedido) {
        this.id = id;
        this.produto = produto;
        this.quant = quant;
        this.valor = valor;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuant() {
        return quant;
    }

    public int calValor() {
        return valor;
    }

    public Pedido getPedido() {
        return pedido;
    }
}

class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class MetodoPagamento {
    private int id;
    private String tipo;

    public MetodoPagamento(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
