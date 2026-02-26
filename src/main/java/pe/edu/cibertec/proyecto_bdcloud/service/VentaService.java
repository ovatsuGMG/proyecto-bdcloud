package pe.edu.cibertec.proyecto_bdcloud.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.proyecto_bdcloud.model.Venta;
import pe.edu.cibertec.proyecto_bdcloud.model.Videojuego;
import pe.edu.cibertec.proyecto_bdcloud.repository.VentaRepository;
import pe.edu.cibertec.proyecto_bdcloud.repository.VideojuegoRepository;

import java.util.List;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    @Autowired
    private VideojuegoRepository videojuegoRepository;

    public List<Venta> listarTodas() {
        return ventaRepository.findAll();
    }

    @Transactional
    public Venta registrarVenta(Venta venta) {
        // 1. Obtener el videojuego de la base de datos para ver el stock
        Videojuego vj = videojuegoRepository.findById(venta.getVideojuego().getId())
                .orElseThrow(() -> new RuntimeException("Videojuego no encontrado"));

        // 2. Validar si hay stock suficiente
        if (vj.getStock() < venta.getCantidad()) {
            throw new RuntimeException("Stock insuficiente para: " + vj.getNombre());
        }

        // 3. Restar el stock y guardar el videojuego actualizado
        vj.setStock(vj.getStock() - venta.getCantidad());
        videojuegoRepository.save(vj);

        // 4. Guardar la venta
        return ventaRepository.save(venta);
    }
}
