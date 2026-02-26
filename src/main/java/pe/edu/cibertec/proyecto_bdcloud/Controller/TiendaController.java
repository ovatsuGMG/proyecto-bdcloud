package pe.edu.cibertec.proyecto_bdcloud.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.proyecto_bdcloud.model.Tienda;
import pe.edu.cibertec.proyecto_bdcloud.service.TiendaService;

import java.util.List;

@RestController
@RequestMapping("/api/tiendas")
public class TiendaController {
    private final TiendaService tiendaService;

    public TiendaController(TiendaService tiendaService) {
        this.tiendaService = tiendaService;
    }

    @GetMapping
    public ResponseEntity<List<Tienda>> listarTiendas() {
        return ResponseEntity.ok(tiendaService.listarTodas());
    }
}
