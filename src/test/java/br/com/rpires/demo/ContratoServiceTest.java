package br.com.rpires.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.rpires.demo.dao.ContratoDao;
import br.com.rpires.demo.dao.IContratoDao;
import br.com.rpires.demo.dao.mocks.ContratoDaoMock;
import br.com.rpires.demo.service.ContratoService;
import br.com.rpires.demo.service.IContratoService;

public class ContratoServiceTest {

	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assertions.assertEquals("Sucesso", retorno);
	}

	@Disabled
	@Test
	public void esperadoErroNoSalvarComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assertions.assertEquals("Sucesso", retorno);
	}

	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assertions.assertEquals("Sucesso", retorno);
	}

	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assertions.assertEquals("Sucesso", retorno);
	}

	@Test
	public void atualizarTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assertions.assertEquals("Sucesso", retorno);

	}

}
