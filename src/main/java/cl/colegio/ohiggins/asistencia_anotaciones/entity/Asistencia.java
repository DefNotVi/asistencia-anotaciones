package cl.colegio.ohiggins.asistencia_anotaciones.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "asistencias")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long alumnoId; // Para conectar con el otro microservicio
    private LocalDate fecha;
    private boolean presente;
    private String observacion;
}
