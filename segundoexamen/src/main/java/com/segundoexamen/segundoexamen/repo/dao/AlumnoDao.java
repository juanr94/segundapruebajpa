package com.segundoexamen.segundoexamen.repo.dao;

import com.segundoexamen.segundoexamen.modelo.Alumno;
import com.segundoexamen.segundoexamen.repo.crud.AlumnoCrud;

import java.util.List;

public interface AlumnoDao {


    List<Alumno> obtenerTodo();

    void agrega(Alumno alumno);
}
