package pe.edu.cibertec.proyecto_bdcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.proyecto_bdcloud.model.Tienda;
import pe.edu.cibertec.proyecto_bdcloud.repository.TiendaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository repository;

    public List<Tienda> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tienda> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Tienda guardar(Tienda tienda) {
        return repository.save(tienda);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
