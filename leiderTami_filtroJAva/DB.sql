drop database if exists ninja;

create database if not exists ninja;
use ninja;
CREATE TABLE ninja (
	id int NOT NULL,
	nombre varchar(255) NOT NULL,
	rango int NOT NULL,
	aldea varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE mision (
	id INT NOT NULL AUTO_INCREMENT,
	descripcion varchar(255) NOT NULL,
	rango char NOT NULL,
	fechainicio varchar(255) NOT NULL,
	fechaFin varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE misionNinja (
	idNinja INT NOT NULL ,
	idMision INT NOT NULL,
	fechaInicio varchar(255) NOT NULL,
	fechaFin varchar(255) NOT NULL
);

CREATE TABLE habilidad (
	idNinja INT NOT NULL AUTO_INCREMENT,
	nombre varchar(255) NOT NULL,
	descripcion varchar(255) NOT NULL,
	PRIMARY KEY (idNinja)
);


ALTER TABLE misionNinja ADD CONSTRAINT misionNinja_fk0 FOREIGN KEY (idNinja) REFERENCES ninja(id);

ALTER TABLE misionNinja ADD CONSTRAINT misionNinja_fk1 FOREIGN KEY (idMision) REFERENCES mision(id);

ALTER TABLE habilidad ADD CONSTRAINT habilidad_fk0 FOREIGN KEY (idNinja) REFERENCES ninja(id);