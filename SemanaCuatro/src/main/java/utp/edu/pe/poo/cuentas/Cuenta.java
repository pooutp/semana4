package utp.edu.pe.poo.cuentas;

public class Cuenta {
    private double saldo;
    private String tipo;
    private String numeroCuenta;
    public Cuenta(){
        saldo=0;
        tipo="Ahorro";
        numeroCuenta="193-2023-2468-968-00";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public boolean transferirCuenta(String numeroCuenta, double montoTransferir){
        double ITF= cobroITF(montoTransferir);
        if(saldo>= (montoTransferir+ITF)){
            saldo-= (montoTransferir+ITF);
            return true;
        } 
        return false;
    }    
        
    public boolean transferirCuenta(String numeroCCI, String banco, double montoTransferir){
        double ITF= cobroITF(montoTransferir);
        if(saldo>= (montoTransferir+ITF+4.5)){
            saldo-= (montoTransferir+ITF+4.5);
            return true;
        } 
        return false;
    }    
       
    public Cuenta(double saldo, String tipo){
        this.saldo=saldo;
        this.tipo = tipo;
    }
    
    private double cobroITF(double monto){
        return monto * 0.00005;
    }
    public boolean retirarCuenta(double montoRetirar){
        montoRetirar += cobroITF(montoRetirar);       
        if (saldoSuficiente(montoRetirar)) {
            saldo-= montoRetirar;
            return true;
        }
        return false;
    }
    
    protected boolean saldoSuficiente(double montoOperacion){
        return (saldo>= montoOperacion);
    }
    
    public void abonarCuenta(double montoAbonar){       
        saldo+= (montoAbonar-cobroITF(montoAbonar));
    }
    
    public String getTipo() {
        return tipo;
    }  
}
