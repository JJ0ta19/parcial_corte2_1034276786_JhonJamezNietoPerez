package com.corhuila.Restaurante.IService;

import com.corhuila.Restaurante.Entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {

    List<Pedido> findAll();
    Optional<Pedido> findById(Long id);
    Pedido save(Pedido pedido);
    void update(Pedido pedido, Long id);
    void delete(Long id);


}
