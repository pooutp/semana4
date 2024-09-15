

package utp.edu.pe.poo.semanacuatro.ejemplos;

public class Alumno extends Persona {
    public String ciclo;
    
        public Alumno (String nombre, int edad, String ciclo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
    }    
    @Override
    public void presentarse() {
        //Se ejecuta al método presentarse 
        //de la clase base (Persona)
        super.presentarse(); 
        System.out.println("Soy alumno del " + ciclo + " ciclo.");
    }
}




