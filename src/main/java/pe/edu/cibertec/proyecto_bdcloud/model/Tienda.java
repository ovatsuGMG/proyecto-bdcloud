package pe.edu.cibertec.proyecto_bdcloud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tienda")
@Data
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreSede;
    private String direccion;
    private String distrito;
}
