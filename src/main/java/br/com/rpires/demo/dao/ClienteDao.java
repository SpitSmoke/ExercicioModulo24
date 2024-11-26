package br.com.rpires.demo.dao;

public class ClienteDao implements IClienteDao {

	public String salvar() {
		throw new UnsupportedOperationException("Não funciona sem config de banco");
		// return "Sucesso";
	}

	@Override
	public String buscar() {
		return null;
	}

	@Override
	public String excluir() {
		return null;
	}

	@Override
	public String atualizar() {
		return null;
	}
}
