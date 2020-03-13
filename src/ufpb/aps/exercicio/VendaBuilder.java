package ufpb.aps.exercicio;

import java.util.List;

public class VendaBuilder {

	private Venda venda;
	private ClientePF clientePF;
	private ClientePJ clientePJ;
	private Frete frete;
	private Funcionario funcionario;
	private ItemVenda itemVenda;


	public VendaBuilder(Venda venda, ClientePF clientePF, ClientePJ clientePJ, Frete frete, Funcionario funcionario,ItemVenda itemVenda) {
		this.venda = venda;
		this.clientePF = clientePF;
		this.clientePJ = clientePJ;
		this.frete = frete;
		this.funcionario = funcionario;
		this.itemVenda = itemVenda;
	}
	

	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}

	public VendaBuilder clientePF(String nome, String cpf) {
		clientePF.setNome(nome);
		clientePF.setCpf(cpf);
		return this;
	}

	public VendaBuilder clientePJ(String rs, String cnpj) {
		clientePJ.setRs(rs);
		clientePJ.setCnpj(cnpj);
		return this;
	}
	
	public VendaBuilder frete(double preco) {
		frete.setValor(preco);
		return this;
	}
	
	public VendaBuilder funcionario(String nome) {
		funcionario.setNome(nome);
		return this;
	}
	public VendaBuilder item(int quantidade, Produto produto) {
		itemVenda.setQuantidade(quantidade);
		itemVenda.setProduto((List<Produto>) produto);	
		return this;
	}
	
	public VendaBuilder Builder(Venda venda) {
		return this;
		
	}
	
	@Override
	public String toString() {
		return "VendaBuilder [venda=" + venda + ", clientePF=" + clientePF + ", clientePJ=" + clientePJ + ", frete="
				+ frete + ", funcionario=" + funcionario + ", itemVenda=" + itemVenda + "]";
	}
}
