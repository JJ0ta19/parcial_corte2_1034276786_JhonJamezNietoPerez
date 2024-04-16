package com.corhuila.Restaurante.Service;


import com.corhuila.Restaurante.Entity.Cliente;
import com.corhuila.Restaurante.IRepository.IClienteRepository;

import com.corhuila.Restaurante.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository repository;

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Cliente cliente, Long id) {

        Optional<Cliente> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){

            Cliente clienteUpdate = ps.get();
            clienteUpdate.setNombre(clienteUpdate.getNombre());
            clienteUpdate.setNombre(clienteUpdate.getTelefono());

            //Actualizar el objeto persona
            repository.save(clienteUpdate);
        }else{
            System.out.println("No existe el cliente");
        }
    }
}
