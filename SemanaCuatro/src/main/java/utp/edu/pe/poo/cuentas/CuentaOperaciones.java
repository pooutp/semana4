
package utp.edu.pe.poo.cuentas;

import utp.edu.pe.poo.cliente.Cliente;
import utp.edu.pe.poo.pantalla.LecturaInformacion;
import utp.edu.pe.poo.pantalla.Pantalla;

public class CuentaOperaciones {
    public static void hacerOperaciones( Cliente cliente){
        String[] opciones = {"Crear Cuenta [1]", "Deposito [2]", "Transferencia [3]",
            "Retiro [4]", "Saldo disponible [5]", "Terminar [6]"};
        String[] transferencias = {"A otra cuenta del banco [1]",
            "A cuenta de otro banco [2]"};
    boolean apagado=true;
    int opcion;
    int destino;
    Pantalla pantalla = new Pantalla();
    Cuenta cuenta = new Cuenta();
    double valor;
    LecturaInformacion lecturaDatos = new LecturaInformacion();
    do{
        opcion = pantalla.Menu("Operaciones", opciones); 
        switch(opcion){
            case 1:
                valor = lecturaDatos.lecturaDouble("creando cuenta", 
                        "Monto de apertura S/: ");
                if(valor>=500){
                    cliente.getCuenta().abonarCuenta(valor);
                }
                break;
            case 2:   
                valor = lecturaDatos.lecturaDouble("DEPOSITO A LA CUENTA", 
                        "Monto a depositar S/: ");
                cliente.getCuenta().abonarCuenta(valor);
                break;
            case 3:   
                destino = pantalla.Menu("TRANSFERENCIA", transferencias); 
                if(destino == 1){
                    String NumeroCuenta;                    
                    NumeroCuenta = lecturaDatos.lecturaString("", 
                            "Ingrese numero cuenta: ");
                    valor = lecturaDatos.lecturaDouble("", 
                        "Monto a transferir S/: ");
                    if(cliente.getCuenta().transferirCuenta(
                            NumeroCuenta, valor))
                        System.out.println("Tranferencia efectuada con éxito");
                    else System.out.println("Saldo insuficiente");
                }
                if(destino == 2){
                    String CCI;
                    String banco;
                    CCI = lecturaDatos.lecturaString("", 
                            "Ingrese numero CCI: ");
                    banco = lecturaDatos.lecturaString("", 
                            "Ingrese nombre del banco: ");
                    valor = lecturaDatos.lecturaDouble("", 
                        "Monto a transferir S/: ");
                    if(cliente.getCuenta().transferirCuenta(
                            CCI, banco, valor))
                        System.out.print("Tranferencia efectuada con éxito");
                    else System.out.print("Saldo insuficiente");
                }
                break;
            case 4:                   
                valor = lecturaDatos.lecturaDouble("RETIRO DE LA CUENTA", 
                        "Monto a retirar S/: ");
                cliente.getCuenta().retirarCuenta(valor);
                break;
             case 5:                   
                System.out.println("Saldo disponible S/: " 
                        +cliente.getCuenta().getSaldo());               
                break;
            case 6:                   
                apagado=false;
                break;
            }            
        } while(apagado);
    }
}
