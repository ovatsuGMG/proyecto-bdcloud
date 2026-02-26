package pe.edu.cibertec.proyecto_bdcloud.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.proyecto_bdcloud.model.Videojuego;
import pe.edu.cibertec.proyecto_bdcloud.repository.VideojuegoRepository;

import java.util.List;

@Service
public class VideojuegoService {
    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    public List<Videojuego> listarVideojuegos() {
        return videojuegoRepository.findAll();
    }
}
