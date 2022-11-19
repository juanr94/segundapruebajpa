package com.segundoexamen.segundoexamen.view;

import com.segundoexamen.segundoexamen.modelo.Alumno;
import com.segundoexamen.segundoexamen.service.AlumnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    private final AlumnoServicio alumnoServicio;


    @Autowired
    public AlumnoController(AlumnoServicio alumnoServicio) {
        this.alumnoServicio = alumnoServicio;
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Alumno alumno){
        this.alumnoServicio.guardar(alumno);
    };

    @GetMapping("/mostrar")
    public List<Alumno> mostrar(){
        return this.alumnoServicio.buscarTodo();
    };
}
