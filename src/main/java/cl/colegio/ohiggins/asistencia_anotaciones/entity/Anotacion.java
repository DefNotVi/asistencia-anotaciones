package cl.colegio.ohiggins.asistencia_anotaciones.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "anotaciones")
public class Anotacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long alumnoId;
    private String descripcion;
    private String tipo; // "Positiva" o "Negativa"
    private LocalDate fecha;
}