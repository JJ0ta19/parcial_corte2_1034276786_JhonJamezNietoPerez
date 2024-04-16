package com.corhuila.Restaurante.Controller;

import com.corhuila.Restaurante.Entity.Cliente;
import com.corhuila.Restaurante.Entity.Pedido;
import com.corhuila.Restaurante.IService.IPedidoService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pedido")
@Controller
public class PedidoController {

    //Inyectar el servicio
    @Autowired
    private IPedidoService service;

    @GetMapping()
    public List<Pedido> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Pedido save(@RequestBody Pedido pedido) {
        return service.save(pedido);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Pedido pedido, @PathVariable Long id) {
        service.update(pedido, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
