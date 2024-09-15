package utp.edu.pe.poo.cliente;

import java.time.LocalDate;
import utp.edu.pe.poo.cuentas.Cuenta;

public class Cliente {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String DNI;
    private LocalDate fechaNacimiento;
    private char sexo;
    private Cuenta cuenta = new Cuenta();
    
    public Cliente(){}

    public Cliente(String nombres, String apellidoPaterno, 
            String apellidoMaterno, String DNI, 
            LocalDate fechaNacimiento, char sexo) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
