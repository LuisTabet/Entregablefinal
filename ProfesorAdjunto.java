package com.company;

public class ProfesorAdjunto extends Profesor{
    Integer horasDeConsulta;


    public ProfesorAdjunto(String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor,
        Integer antiguedadDelProfesor, Integer horasDeConsulta) {
        super(nombreDelProfesor, apellidoDelProfesor, codigoDelProfesor, antiguedadDelProfesor);

        this.horasDeConsulta = horasDeConsulta;
    }
    public ProfesorAdjunto (String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor) {
        super(nombreDelProfesor, apellidoDelProfesor, codigoDelProfesor, 0);
        this.horasDeConsulta = horasDeConsulta;

    }

    public ProfesorAdjunto() {
        super();

    }

    public ProfesorAdjunto(String nombreDelProfesor, String apellidoDelProfesor, Integer codigoDelProfesor, Integer horasDeConsulta) {
    }


    public Integer getHorasDeConsulta() {
        return horasDeConsulta;
    }

    public void setHorasDeConsulta(Integer horasDeConsulta) {

        this.horasDeConsulta = horasDeConsulta;
    }

    @Override
    public String toString() {
        return super.toString() +"Horas de Consulta: " + horasDeConsulta;
    }

}
