package com.corhuila.Restaurante.IRepository;

import com.corhuila.Restaurante.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido,Long> {
}
