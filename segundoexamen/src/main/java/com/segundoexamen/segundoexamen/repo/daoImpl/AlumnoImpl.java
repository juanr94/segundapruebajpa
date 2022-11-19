package com.segundoexamen.segundoexamen.repo.daoImpl;

import com.segundoexamen.segundoexamen.modelo.Alumno;
import com.segundoexamen.segundoexamen.repo.crud.AlumnoCrud;
import com.segundoexamen.segundoexamen.repo.dao.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class AlumnoImpl implements AlumnoDao {
    private final DataSource dataSource;
    private final AlumnoCrud alumnoCrud;

    @Autowired
    public AlumnoImpl(DataSource dataSource, AlumnoCrud alumnoCrud) {
        this.dataSource = dataSource;
        this.alumnoCrud = alumnoCrud;
    }

    @Override
    public List<Alumno> obtenerTodo() {
        return (List<Alumno>) alumnoCrud.findAll();
    }

    @Override
    public void agrega(Alumno alumno) {
        this.alumnoCrud.save(alumno);
    }
}
