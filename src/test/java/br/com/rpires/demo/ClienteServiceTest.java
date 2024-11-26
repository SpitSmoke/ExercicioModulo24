package br.com.rpires.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.rpires.demo.dao.ClienteDao;
import br.com.rpires.demo.dao.ClienteDaoMock;
import br.com.rpires.demo.dao.IClienteDao;
import br.com.rpires.demo.service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);
    }

    @Test
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);
    }
}
