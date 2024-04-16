package com.corhuila.Restaurante.Service;

import com.corhuila.Restaurante.Entity.Pedido;
import com.corhuila.Restaurante.IRepository.IPedidoRepository;
import com.corhuila.Restaurante.IService.IPedidoService;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService implements IPedidoService {
    @Autowired
    private IPedidoRepository repository;

    @Override
    public List<Pedido> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Pedido pedido, Long id) {

        Optional<Pedido> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){

            Pedido pedidoUpdate = ps.get();
            pedidoUpdate.setNombreProducto(pedidoUpdate.getNombreProducto());
            pedidoUpdate.setCantidad(pedidoUpdate.getCantidad());
            pedidoUpdate.setValor(pedidoUpdate.getValor());
            pedidoUpdate.setCliente(pedidoUpdate.getCliente());



            //Actualizar el objeto persona
            repository.save(pedidoUpdate);
        }else{
            System.out.println("No existe el pedido");
        }
    }

}
