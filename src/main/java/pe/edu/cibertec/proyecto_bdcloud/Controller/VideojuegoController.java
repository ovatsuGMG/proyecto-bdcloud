package pe.edu.cibertec.proyecto_bdcloud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.proyecto_bdcloud.model.Videojuego;
import pe.edu.cibertec.proyecto_bdcloud.repository.VideojuegoRepository;
import pe.edu.cibertec.proyecto_bdcloud.service.VideojuegoService;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {
    private final VideojuegoService videojuegoService;

    public VideojuegoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @GetMapping
    public ResponseEntity<List<Videojuego>> listarVideojuegos() {
        return ResponseEntity.ok(videojuegoService.listarVideojuegos());
    }

}