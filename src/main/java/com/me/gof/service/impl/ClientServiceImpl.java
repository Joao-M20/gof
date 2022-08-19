package com.me.gof.service.impl;

import com.me.gof.model.Client;
import com.me.gof.model.ClientRepository;
import com.me.gof.model.EnderecoRepository;
import com.me.gof.service.ClientService;
import com.me.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> buscarTodos() {

        return null;
    }

    @Override
    public Client buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Client client) {

    }

    @Override
    public void atualizar(Long id, Client client) {

    }

    @Override
    public void deletar(Long id) {

    }


}
