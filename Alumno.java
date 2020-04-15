package com.company;
/*Creo la clase Alumno, e ingreso los atributos*/
public class Alumno {
    private String nombreDelAlumno;
    private String apellidoDelAlumno;
    private Integer codigoDelAlumno;

    //Constructor
    public Alumno(String nombreDelAlumno, String apellidoDelAlumno, Integer codigoDelAlumno) {
        this.nombreDelAlumno = nombreDelAlumno;
        this.apellidoDelAlumno = apellidoDelAlumno;
        this.codigoDelAlumno = codigoDelAlumno;
     }
    //Constructor por defecto sin ingresar parámetros
    public Alumno() {
    }


    public String getNombreDelAlumno() {
        return nombreDelAlumno;
    }

    public String getApellidoDelAlumno() {
        return apellidoDelAlumno;
    }

    public Integer getCodigoDelAlumno() {
        return codigoDelAlumno;
    }



    public void setNombreDelAlumno(String nombreDelAlumno) {

        this.nombreDelAlumno = nombreDelAlumno;
    }

    public void setApellidoDelAlumno(String apellidoDelAlumno) {

        this.apellidoDelAlumno = apellidoDelAlumno;
    }

    public void setCodigoDelAlumno(Integer codigoDelAlumno) {

        this.codigoDelAlumno = codigoDelAlumno;
    }



    @Override

    public String toString() {
        //Le doy un formato en columna y le agregue un encabezado.
        return String.format ("%6d  %-15s %-15s\n",
                codigoDelAlumno, nombreDelAlumno, apellidoDelAlumno);

    }
    //igualdad de alumnos.

    @Override
    public boolean equals(Object o) {
        // La igualdad se verifica por el codigoDeAlumno
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
            Alumno algunAlumno = (Alumno) o;
            if (!this.codigoDelAlumno.equals(algunAlumno.codigoDelAlumno)) {
                return false;
            }
            return true;
        }

    }