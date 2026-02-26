package pe.edu.cibertec.proyecto_bdcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.proyecto_bdcloud.model.Proveedor;
import pe.edu.cibertec.proyecto_bdcloud.repository.ProveedorRepository;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository repository;

    public List<Proveedor> listarTodos() {
        return repository.findAll();
    }
}
