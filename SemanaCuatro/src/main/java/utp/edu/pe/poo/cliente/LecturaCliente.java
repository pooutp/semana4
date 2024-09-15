package utp.edu.pe.poo.cliente;

import java.time.LocalDate;
import utp.edu.pe.poo.pantalla.LecturaInformacion;
import utp.edu.pe.poo.pantalla.Titulo;

public class LecturaCliente {
    public static Cliente lecturaCliente(){
        LecturaInformacion lecturaDatos = new LecturaInformacion();
        Titulo.Mensaje("DATOS DEL CLIENTE");
        String nombres = lecturaDatos.lecturaString("", "Nombres: ");
        String apellidoPaterno = lecturaDatos
                .lecturaString("", "Apellido Paterno: ");
        String apellidoMaterno = lecturaDatos
                .lecturaString("", "Apellido Materno: ");
        String DNI = lecturaDatos
                .lecturaString("", "DNI: ");
        LocalDate fechaNacimiento = lecturaDatos.
                lecturaFecha("","Fecha de nacimiento (dd/MM/yyyy): ");
        char sexo = lecturaDatos.lecturaChar("", "Sexo {M/F}: ");
        Cliente cliente = new Cliente(nombres, apellidoPaterno,apellidoMaterno,
                            DNI, fechaNacimiento, sexo);
        return cliente;
    }
}
