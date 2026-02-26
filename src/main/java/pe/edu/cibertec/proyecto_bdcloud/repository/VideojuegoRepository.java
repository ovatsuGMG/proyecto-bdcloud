package pe.edu.cibertec.proyecto_bdcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.proyecto_bdcloud.model.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego,Integer> {
}
