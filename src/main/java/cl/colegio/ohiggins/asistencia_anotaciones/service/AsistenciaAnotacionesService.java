package cl.colegio.ohiggins.asistencia_anotaciones.service;

import cl.colegio.ohiggins.asistencia_anotaciones.entity.Anotacion;
import cl.colegio.ohiggins.asistencia_anotaciones.entity.Asistencia;
import cl.colegio.ohiggins.asistencia_anotaciones.repository.AnotacionRepository;
import cl.colegio.ohiggins.asistencia_anotaciones.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaAnotacionesService {

    @Autowired
    private AsistenciaRepository asistenciaRepo;

    @Autowired
    private AnotacionRepository anotacionRepo;

    // --- Lógica para ASISTENCIAS ---
    
    public List<Asistencia> listarAsistencias() {
        return asistenciaRepo.findAll();
    }

    public Asistencia guardarAsistencia(Asistencia asistencia) {
        return asistenciaRepo.save(asistencia);
    }

    // --- Lógica para ANOTACIONES ---

}