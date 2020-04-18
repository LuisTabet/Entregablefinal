package com.company;

import java.util.List;
import java.util.ArrayList;
//Esta clase es la que va a manejar lo mayoría de los métodos.

public class DigitalHouseManager {
    private List<Profesor> profesores;
    private static List<Alumno> alumnos;
    private List<Curso> cursos;
    private List<Inscripcion> inscripciones;

    public DigitalHouseManager() {
        profesores = new ArrayList<>();
        alumnos = new ArrayList<>();
        cursos = new ArrayList<>();
        inscripciones = new ArrayList<>();

    }



    public void altaCurso(String nombreDelCurso, Integer codigoDelCurso,
                          int cupoMaximoDelCurso) {
        altaCurso(new Curso(nombreDelCurso, codigoDelCurso,
                            cupoMaximoDelCurso));
    }

    public void altaCurso(Curso c) {
        cursos.add(c);
    }

    /*Aquí busco la posición en la que está ubicado el curso, porque la voy a
     necesitar para asignarle los profesores, darlo de baja y saber si hay cupo. */

    private Integer buscarCodigoDelCurso(Integer codigoDelCurso) {
        for (int posicionC = 0; posicionC < cursos.size(); posicionC++) {
            if (codigoDelCurso.equals(cursos.get(posicionC).getCodigoDelCurso())) {
                return posicionC;
            }
        }

            return -1;
    }


    public void bajaCurso(Integer codigoDelCurso) {

        int posicionC = buscarCodigoDelCurso(codigoDelCurso);
        if (posicionC == -1) {
            System.out.println("Error en el código del curso");
        } else {
            cursos.remove(posicionC);
            System.out.println("Se elimino el curso" + cursos.get(posicionC).getNombreDelCurso());
        }
    }


    public void altaProfesorTitular(String nombreDelProfesor, String apellidoDelProfesor,
                                    Integer codigoDelProfesor, Integer especialidad) {
        altaProfesorTitular(new ProfesorTitular(nombreDelProfesor, apellidoDelProfesor,
                                                codigoDelProfesor, especialidad));
    }

    public void altaProfesorTitular(ProfesorTitular pt) {
        profesores.add(pt);
    }

    public void altaProfesorAdjunto(String nombreDelProfesor, String apellidoDelProfesor,
                                    Integer codigoDelProfesor, Integer horasDeConsulta) {
        altaProfesorAdjunto(new ProfesorAdjunto(nombreDelProfesor, apellidoDelProfesor,
                                                codigoDelProfesor, horasDeConsulta));
    }

    public void altaProfesorAdjunto(ProfesorAdjunto pa) {
        profesores.add(pa);
    }

    private Integer buscarCodigoDelProfesor(Integer codigoDelProfesor) {
        for (int posicionP = 0; posicionP < profesores.size(); posicionP++) {
            if (codigoDelProfesor.equals(profesores.get(posicionP).getCodigoDelProfesor())) {
                return posicionP;
            }
        }
        return -1;
    }

    public void asignarProfesores(Integer codigoDelProfesorTitular, Integer codigoDelProfesorAdjunto,
                                  Integer codigoDelCurso) {
        Curso cursoAsignado;
        ProfesorTitular profesorTitularAsignado = null;
        ProfesorAdjunto profesorAdjuntoAsignado = null;

        int posicionPt = buscarCodigoDelProfesor(codigoDelProfesorTitular);
        if (posicionPt == -1) {
            System.out.println("Error: no se encuentra al profesor titular");
        } else {
            profesorTitularAsignado = (ProfesorTitular) profesores.get(posicionPt);
        }
        int posicionPa = buscarCodigoDelProfesor(codigoDelProfesorAdjunto);
        if (posicionPa == -1) {
            System.out.println("Error: no se encuentra al profesor adjunto");
        } else {
            profesorAdjuntoAsignado = (ProfesorAdjunto) profesores.get(posicionPa);
        }
        int posicionC = buscarCodigoDelCurso(codigoDelCurso);
        if (posicionC == -1) {
            System.out.println("Curso no registrado");
        } else {
            cursoAsignado = cursos.get(posicionC);
            cursoAsignado.setProfesorTitularCurso(profesorTitularAsignado);
            cursoAsignado.setProfesorAdjuntoCurso(profesorAdjuntoAsignado);
            System.out.println("El curso de " + cursos.get(posicionC).getNombreDelCurso() +
                                       " está a cargo de los profesores " + profesores.get
                    (posicionPt).getApellidoDelProfesor() +
                                       " y " + profesores.get(posicionPa).getApellidoDelProfesor());

        }
    }


    public void bajaProfesor(Integer codigoDelProfesor) {
        int posicionP = buscarCodigoDelProfesor(codigoDelProfesor);
        if (posicionP == -1) {
            System.out.println("Error en el código del curso");
        } else {
            profesores.remove(posicionP);
            System.out.println("El profesor " + profesores.get(posicionP).getApellidoDelProfesor() +
                                       " fue dado de baja");
        }
    }


    public void altaAlumno(String nombreDelAlumno, String apellidoDelAlumno,
                           Integer codigoDelAlumno) {
        altaAlumno(new Alumno(nombreDelAlumno, apellidoDelAlumno, codigoDelAlumno));
    }

    public void altaAlumno(Alumno a) {
        alumnos.add(a);
    }

    private Integer buscarCodigoDeAlumno(Integer codigoDeAlumno) {
        for (int posicionA = 0; posicionA < alumnos.size(); posicionA++) {
            if (codigoDeAlumno.equals(alumnos.get(posicionA).getCodigoDelAlumno())) {
                return posicionA;
            }
        }
        return -1;
    }

/*En este método veo si están las condiciones necesarias para inscribir al alumno. No pude
    resolver bien la parte del cupoMaximo. y no sé donde me equivoqué.*/

    public void inscribirAlumno(Integer codigoDelCurso, Integer codigoDelAlumno) {
        Curso cursoEncontrado;
        Alumno alumnoEncontrado;
        int posicionC;
        posicionC = buscarCodigoDelCurso(codigoDelCurso);
        if (posicionC == -1) {
            System.out.println("Error: el curso no existe");
        } else {
            int posicionA = buscarCodigoDeAlumno(codigoDelAlumno);
            if (posicionA == -1) {
                System.out.println("Alumno no registrado");
            } else {
            cursoEncontrado = cursos.get(posicionC);
            if (cursoEncontrado.hayCupo()) {
                alumnoEncontrado = alumnos.get(posicionA);
                Inscripcion nuevaInscripcion = new Inscripcion(alumnoEncontrado,
                                                               cursoEncontrado);
                inscripciones.add(nuevaInscripcion);
                System.out.println("Se realizó correctamente la inscripción" +
                                           nuevaInscripcion.toString());

            } else {
                System.out.println("No queda cupo para este curso");
            }
            }
        }
    }
}








