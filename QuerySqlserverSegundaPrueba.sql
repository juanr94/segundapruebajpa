use consultas;


create table  Alumno(
	Id integer identity primary key,
	Nombres varchar(150),
	Apellidos varchar(150),
	Edad integer
);

Insert into Alumno (Nombres, Apellidos, Edad) values ('CECILIA', 'BENITESDEL SOLAR', 17),
('LUIS DAVID', 'BUSTOS MAYTA', 16);

	select * from Alumnos