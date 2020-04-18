package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreDelCurso;
    private Integer codigoDelCurso;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> alumnos;
    private ProfesorTitular profesorTitularCurso;
    private ProfesorAdjunto profesorAdjuntoCurso;
    //Ya que además de los atributos, tiene alumnos, un profesor titular y un profesor adjunto.


    public Curso(String nombreDelCurso, Integer codigoDelCurso, Integer cupoMaximoDeAlumnos, List<Alumno>
            alumnosCurso, ProfesorTitular profesorTitularCurso, ProfesorAdjunto profesorAdjuntoCurso) {
        this.nombreDelCurso = nombreDelCurso;
        this.codigoDelCurso = codigoDelCurso;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        alumnos = new ArrayList<>();
        this.profesorTitularCurso = profesorTitularCurso;
        this.profesorAdjuntoCurso = profesorAdjuntoCurso;
    }

    public Curso(String nombreDelCurso, Integer codigoDelCurso, Integer cupoMaximoDeAlumnos) {
        this.nombreDelCurso = nombreDelCurso;
        this.codigoDelCurso = codigoDelCurso;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        profesorAdjuntoCurso = new ProfesorAdjunto();
        profesorTitularCurso = new ProfesorTitular();
        alumnos = new ArrayList<>();


    }

    public Curso() {
        alumnos = new ArrayList<>();
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public Integer getCodigoDelCurso() {
        return codigoDelCurso;
    }

    public void setCodigoDelCurso(Integer codigoDelCurso) {
        this.codigoDelCurso = codigoDelCurso;
    }

    public Integer getCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
    }

    public void setCupoMaximoDeAlumnos(Integer cupoMaximoDeAlumnos) {
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    }

    public ProfesorTitular getProfesorTitularCurso() {
        return profesorTitularCurso;
    }

    public void setProfesorTitularCurso(ProfesorTitular profesorTitularCurso) {
        this.profesorTitularCurso = profesorTitularCurso;
    }

    public ProfesorAdjunto getProfesorAdjuntoCurso() {
        return profesorAdjuntoCurso;
    }

    public void setProfesorAdjuntoCurso(ProfesorAdjunto profesorAdjuntoCurso) {
        this.profesorAdjuntoCurso = profesorAdjuntoCurso;
    }

    @Override
    public String toString() {
        return "Nombre del curso" + nombreDelCurso + "   " + "Codigo" + codigoDelCurso + "\n" +
                "Profesor titular" + profesorTitularCurso.toString() + "\n" + "Profesor adjunto" +
                profesorAdjuntoCurso.toString() + "\n" + "Alumnos inscriptos" + alumnos.toString()
                + "\n" + "Cupo establecido de alumnos" + cupoMaximoDeAlumnos;
    }

    @Override
    public boolean equals(Object o) {
        // La igualdad se verifica por el codigoDeCurso
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Curso algunCurso = (Curso) o;
        if (!this.codigoDelCurso.equals(algunCurso.codigoDelCurso)) {
            return false;
        }
        return true;
    }

    /* Para agregar un alumno, se verifica que el alumno exista y que además haya cupo.
    Creo que esta parte tiene un error, pero no lo pude detectar.*/


    public boolean agregarUnAlumno(Alumno unAlumno) {
        boolean sePuedeAgregar = false;
        if (!existeElAlumno(unAlumno.getCodigoDelAlumno()) && hayCupo()) {
            this.cupoMaximoDeAlumnos--;
            sePuedeAgregar = alumnos.add(unAlumno);
        }
        return sePuedeAgregar;
    }
    //Otro método, se elimina un alumno, previa verificación de que exista.

    public void eliminarAlumno(Alumno unAlumno) {
        if (!existeElAlumno(unAlumno.getCodigoDelAlumno())) {
            System.out.println("No existe ningún alumno con este código");
        } else {
            alumnos.remove(unAlumno);
        }
    }


    public String alumnosToString() {
        String s = "\nAlumnos Inscriptos: \n";
        for (Alumno a : alumnos) {
            s += a.toString() + "\n";
        }
        return s;

    }

    //Este booleano indica si se cumple la condición de cupo máximo.


    public boolean hayCupo() {

        return alumnos.size() <= cupoMaximoDeAlumnos;

    }



    public boolean existeElAlumno(int codigoDelAlumno) {
        for (Alumno a : alumnos) {
            if (a.getCodigoDelAlumno() == codigoDelAlumno) {
                return true;
            }
        }
            return false;
        }
    }








