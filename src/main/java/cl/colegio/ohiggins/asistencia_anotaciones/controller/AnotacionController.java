package cl.colegio.ohiggins.asistencia_anotaciones.controller;

import cl.colegio.ohiggins.asistencia_anotaciones.entity.Anotacion;
import cl.colegio.ohiggins.asistencia_anotaciones.service.AsistenciaAnotacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/anotaciones")
public class AnotacionController {

    @Autowired
    private AsistenciaAnotacionesService service;

    @GetMapping
    public List<Anotacion> getAll() {
        return service.listarAnotaciones();
    }

    @PostMapping
    public Anotacion create(@RequestBody Anotacion anotacion) {
        return service.guardarAnotacion(anotacion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.eliminarAnotacion(id);
    }
}