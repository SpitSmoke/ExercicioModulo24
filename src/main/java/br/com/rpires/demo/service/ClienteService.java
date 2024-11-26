package br.com.rpires.demo.service;

import br.com.rpires.demo.dao.ClienteDao;
import br.com.rpires.demo.dao.ClienteDaoMock;
import br.com.rpires.demo.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        clienteDao = new ClienteDao();
        clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
