package com.company;

import static com.company.DigitalHouseManager.*;

public class Main {


    public static void main(String[] args) {
        /*A partir de aquí a partir delJefe empiezo a instanciar profesores cursos y a
        agregar alumnos*/

        DigitalHouseManager elJefe = new DigitalHouseManager();

        ProfesorTitular profesorTitular = new ProfesorTitular
                ("Evaristo", "Carriego", 3001,
                 9, "Full Stack");
        ProfesorTitular otroProfesorTitular = new ProfesorTitular
                ("Jose", "Hernandez", 3002,
                 7, "Android");
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto
                ("Julio", "Cortazar", 4001,
                 3, 8);
        ProfesorAdjunto otroProfesorAdjunto = new ProfesorAdjunto
                ("Ernesto", "Sabato", 4002,
                 2, 10);
        Curso nuevoCurso = new Curso("Full Stack", 20001, 1);
        Curso otroCurso = new Curso("Android", 20002, 1);


        elJefe.altaProfesorTitular(profesorTitular);
        elJefe.altaProfesorTitular(otroProfesorTitular);

        elJefe.altaProfesorAdjunto(profesorAdjunto);
        elJefe.altaProfesorAdjunto(otroProfesorAdjunto);

        elJefe.altaCurso(nuevoCurso);
        elJefe.altaCurso(otroCurso);

        elJefe.asignarProfesores(3001, 4001,
                                 20001);
        elJefe.asignarProfesores(3002, 4002,
                                 20002);


        elJefe.altaAlumno("Martin", "Fierro", 1001);
        elJefe.altaAlumno("Santos", "Vega", 1002);
        elJefe.altaAlumno("Lucia", "Rocamadour", 1003);


        elJefe.inscribirAlumno(20001, 1002);
        elJefe.inscribirAlumno(20001, 1003);
        elJefe.inscribirAlumno(20002, 1001);
        elJefe.inscribirAlumno(20002, 1002);
        elJefe.inscribirAlumno(20002, 1003);

        elJefe.bajaProfesor(4001);

        elJefe.bajaCurso(20001);




    }
}
/* En la parte K, se puede hacer un método en DigitalHouse que que recorra la lista cursos
(un for each), y cada vez que aparezca en alumnos (código del alumno), dé la
orden de imprimir*/