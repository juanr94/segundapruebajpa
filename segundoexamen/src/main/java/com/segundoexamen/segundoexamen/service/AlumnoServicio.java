package com.segundoexamen.segundoexamen.service;

import com.segundoexamen.segundoexamen.modelo.Alumno;
import com.segundoexamen.segundoexamen.repo.crud.AlumnoCrud;
import com.segundoexamen.segundoexamen.repo.dao.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServicio {


    private final AlumnoDao alumnoDao;

    @Autowired
    public AlumnoServicio(AlumnoDao alumnoDao) {
        this.alumnoDao = alumnoDao;
    }

    public void guardar(Alumno alumno){
        this.alumnoDao.agrega(alumno);
    }

    public List<Alumno> buscarTodo(){
       return (List<Alumno>) this.alumnoDao.obtenerTodo();
    }

}
