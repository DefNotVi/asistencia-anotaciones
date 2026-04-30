package cl.colegio.ohiggins.asistencia_anotaciones.repository;

import cl.colegio.ohiggins.asistencia_anotaciones.entity.Anotacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotacionRepository extends JpaRepository<Anotacion, Long> {
    // Aquí pueden añadir sus propios métodos
    // pero al extender JpaRepository, ya tienen el .save(), .findAll(), etc.
}