package contas;

public class Conta {
    private int idConta;
    private String dataVenc;
    private String dataPag;
    private Produto produto;
    private Cliente cliente;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto produto, Cliente cliente) {
        this.idConta = idConta;
        this.dataVenc = dataVencimento;
        this.dataPag = dataPagamento;
        this.produto = produto;
        this.cliente = cliente;
    }

    public void visualizarConta() {
        System.out.println("Id da conta: " + idConta);
        System.out.println("Nome do produto: " + produto.getDescricaoProduto());
        System.out.println("Nome do cliente: " + cliente.getNomeCliente() + " CPF: " + cliente.getCpf());
        System.out.println("Valor do produto: " + produto.getValorProduto());
        System.out.println("Data de vencimento: " + dataVenc);
        System.out.println("Data de pagamento: " + dataPag);
    }
}