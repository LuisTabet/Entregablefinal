package com.company;
//Se establece la clase abstracta Profesor
public abstract class Profesor {
    private String nombreDelProfesor;
    private String apellidoDelProfesor;
    private Integer codigoDelProfesor;
    private Integer antiguedadDelProfesor;


    public Profesor(String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor,
                    Integer antiguedadDelProfesor) {
        this.nombreDelProfesor = nombreDelProfesor;
        this.apellidoDelProfesor = apellidoDelProfesor;
        this.codigoDelProfesor = codigoDelProfesor;
        this.antiguedadDelProfesor = antiguedadDelProfesor;

    }
    //Y como en la clase Alumno, hago un constructor por defecto, por las dudas.

    public Profesor() {super();
    }

     public String getNombreDelProfesor() {
        return nombreDelProfesor;
    }

    public void setNombreDelProfesor(String nombreDelProfesor) {
        this.nombreDelProfesor = nombreDelProfesor;
    }

    public String getApellidoDelProfesor() {
        return apellidoDelProfesor;
    }

    public void setApellidoDelProfesor(String apellidoDelProfesor) {
        this.apellidoDelProfesor = apellidoDelProfesor;
    }

    public Integer getCodigoDelProfesor() {
        return codigoDelProfesor;
    }

    public void setCodigoDelProfesor(Integer codigoDelProfesor) {
        this.codigoDelProfesor = codigoDelProfesor;
    }

    public Integer getAntiguedadDelProfesor() {
        return antiguedadDelProfesor;
    }

    public void setAntiguedaddelProfesor(Integer antiguedad) {
        this.antiguedadDelProfesor = antiguedadDelProfesor;
    }


    @Override

    public String toString() {
        return "Nombre y apellido:" + nombreDelProfesor + "," + apellidoDelProfesor + "/n"
                + "código del profesor" + codigoDelProfesor + "," + "Antiguedad" + antiguedadDelProfesor;
    }
    @Override
    public boolean equals(Object o) {
        // La igualdad se verifica por el codigoDeProfesor
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Profesor algunProfesor = (Profesor) o;
        if (!this.codigoDelProfesor.equals(algunProfesor.codigoDelProfesor)) {
            return false;
        }
        return true;
    }
    }



