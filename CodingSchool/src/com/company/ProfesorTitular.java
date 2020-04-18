package com.company;
//De la clase Profesor heredan las de ProfesorTitular, en la siguiente Profesor Adjunto
public class ProfesorTitular extends Profesor{

    private String especialidad;

    public ProfesorTitular(String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor,
                           Integer antiguedadDelProfesor, String especialidad) {
        super(nombreDelProfesor, apellidoDelProfesor, codigoDelProfesor, antiguedadDelProfesor);
        this.especialidad = especialidad;

    }
    public ProfesorTitular(String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor,
                           String especialidad) {
        super(nombreDelProfesor, apellidoDelProfesor, codigoDelProfesor, 0);
        this.especialidad = especialidad;

    }

    public ProfesorTitular()
    {super ();}

    public ProfesorTitular(String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor, Integer especialidadTitular) {
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
public String toString() {
    return super.toString() + "Especialidad: " + especialidad;
}
}

