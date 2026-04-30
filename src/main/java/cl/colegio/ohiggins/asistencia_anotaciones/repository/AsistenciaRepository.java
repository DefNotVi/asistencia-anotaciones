package cl.colegio.ohiggins.asistencia_anotaciones.repository;

import cl.colegio.ohiggins.asistencia_anotaciones.entity.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
    // Aquí pueden agregar métodos como findByAlumnoId(Long id) o algo así
}
