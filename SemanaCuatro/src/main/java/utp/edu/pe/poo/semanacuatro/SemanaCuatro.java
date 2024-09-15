package utp.edu.pe.poo.semanacuatro;


import utp.edu.pe.poo.cliente.Cliente;
import utp.edu.pe.poo.cliente.LecturaCliente;
import utp.edu.pe.poo.cuentas.CuentaOperaciones;
import utp.edu.pe.poo.pantalla.Pantalla;

public class SemanaCuatro {
    
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Cliente cliente = new Cliente();
        boolean apagado=true;
        int opcion;
   
        String[] opciones = {"Generar Cliente [1]",
            "Realizar Operaciones [2]","Salir [3]"};
        
        do{
            opcion = pantalla.Menu(
                    "Cajero automático", opciones);             
            switch(opcion){
                case 1:                    
                    cliente = LecturaCliente.lecturaCliente();
                    break;
                case 2:   
                    CuentaOperaciones.hacerOperaciones(cliente);
                    break;
                case 3:                   
                    apagado=false;
                    break;
            }            
        } while(apagado);
    }
}








