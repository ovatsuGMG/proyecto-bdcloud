package pe.edu.cibertec.proyecto_bdcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.proyecto_bdcloud.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
