INSERT INTO ninja (id, nombre, rango, aldea) VALUES
(1, 'naruto', 10,'konoha'),
(2, 'sasuke', 9, 'konoha'),
(3, 'sakura', 8, 'konoha');

INSERT INTO mision (id,descripcion, rango, fechainicio, fechaFin) VALUES
(1,'buscar la ubicacion de akatsuki', 'A', '2023-10-21', '2023-11-22'),
(2,'escolta a un mercader', 'B', '2023-09-11', '2023-10-10'),
(3,'encuentra un perro perdido', 'C', '2023-08-01', '2023-08-10');

INSERT INTO misionNinja (idNinja, idMision, fechaInicio, fechaFin) VALUES
(1, 1, '2023-10-21', '2023-11-22'),
(2, 1, '2023-09-11', '2023-10-10'),
(3, 2, '2023-08-01', '2023-08-10');

INSERT INTO habilidad (idNinja, nombre, descripcion) VALUES
(1, 'rasengan', 'esfera de chakra en espiral'),
(2, 'chidori', 'destello electrico de chakra'),
(3, 'ninjutsu medico', 'curacion de heridas');