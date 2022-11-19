package com.segundoexamen.segundoexamen.alumnoBackBean;


import com.segundoexamen.segundoexamen.clientRest.ClienteRest;
import com.segundoexamen.segundoexamen.modelo.Alumno;
import com.segundoexamen.segundoexamen.service.AlumnoServicio;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Scope(value = "session")
@Component
@Data
public class AlumnoBackbean implements Serializable {

     private final static long serialVersionUID = 1L;
     private final AlumnoServicio alumnoController;
     private ClienteRest clienteRest;

     private String nombre;
     private String apellido;
     private Integer edad;

     private List<Alumno> alumnoList;

     @Autowired
     public AlumnoBackbean(AlumnoServicio alumnoController) {
          this.alumnoController = alumnoController;
     }

     @PostConstruct
     public void init(){
          this.clienteRest = new ClienteRest();
          this.clienteRest.setUrl("http://localhost:8090/alumno/alumno/mostrar");
     }

     public void obtenerTodos() {
          this.alumnoList = this.clienteRest.obtenerPersonas();
     }

     public void agregar() {
          Alumno alumno = new Alumno();
          alumno.setNombres(this.nombre);
          alumno.setApellidos(this.apellido);
          alumno.setEdad(this.edad);
          this.alumnoController.guardar(alumno);
     }

}
