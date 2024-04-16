package com.corhuila.Restaurante.IService;




import com.corhuila.Restaurante.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente cliente);
    void update(Cliente cliente, Long id);
    void delete(Long id);
}
