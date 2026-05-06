package cl.colegio.ohiggins.asistencia_anotaciones.controller;

import cl.colegio.ohiggins.asistencia_anotaciones.entity.Asistencia;
import cl.colegio.ohiggins.asistencia_anotaciones.service.AsistenciaAnotacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {

    @Autowired
    private AsistenciaAnotacionesService service;

    @GetMapping
    public List<Asistencia> getAll() {
        return service.listarAsistencias();
    }

    @PostMapping
    public Asistencia create(@RequestBody Asistencia asistencia) {
        return service.guardarAsistencia(asistencia);
    }
}