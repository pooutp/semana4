
package utp.edu.pe.poo.semanacuatro.ejemplos;

import java.util.List;
public class Profesor extends Persona {
    public String asignatura;
    public List<Alumno> alumnos;
    public Profesor(String nombre, int edad, 
            String asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
    }
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    @Override
    public void presentarse() {
        //Se ejecuta al método presentarse 
        //de la clase base (Persona)
        super.presentarse(); 
        System.out.println("Soy profesor de "
                + asignatura + ".");
    }
}


