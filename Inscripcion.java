package com.company;

import java.util.ArrayList;
import java.util.Date;

//A través e esta clase se registran las inscripciones a los cursos, con su fecha.
public class Inscripcion {
    private Alumno alumnos;
    private Curso cursos;
    private Date fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumnos, Curso cursos) {
        this.alumnos = alumnos;
        this.cursos = cursos;
        fechaInscripcion = new Date();
    }

    public Inscripcion(Alumno alumnos, Curso cursos, Date fechaInscripcion) {

        this.alumnos = alumnos;
        this.cursos = cursos;
        fechaInscripcion = new Date();
    }

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public String toString() {
        System.out.println("\nInscripto en la fecha " + fechaInscripcion.toString() + " \nCurso: "
        + cursos.getNombreDelCurso() + "\nAlumno: " + alumnos.getNombreDelAlumno() + " " +
        alumnos.getApellidoDelAlumno() + "  " + alumnos.getCodigoDelAlumno().
                toString());
        return "";
    }
}