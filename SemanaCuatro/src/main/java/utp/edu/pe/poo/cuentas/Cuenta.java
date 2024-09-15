package utp.edu.pe.poo.cuentas;

public class Cuenta {
    private double monto;
    private String tipo;
    private String numeroCuenta;
    public Cuenta(){
        monto=0;
        tipo="Ahorro";
        numeroCuenta="193-2023-2468-968-00";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public boolean transferirCuenta(String numeroCuenta, double montoTransferir){
        double ITF= cobroITF(montoTransferir);
        if(monto>= (montoTransferir+ITF)){
            monto-= (montoTransferir+ITF);
            return true;
        } 
        return false;
    }    
        
    public boolean transferirCuenta(String numeroCCI, String banco, double montoTransferir){
        double ITF= cobroITF(montoTransferir);
        if(monto>= (montoTransferir+ITF+4.5)){
            monto-= (montoTransferir+ITF+4.5);
            return true;
        } 
        return false;
    }    
       
    public Cuenta(double monto, String tipo){
        this.monto=monto;
        this.tipo = tipo;
    }
    
    private double cobroITF(double monto){
        return monto * 0.00005;
    }
    public boolean retirarCuenta(double montoRetirar){
        double ITF= cobroITF(montoRetirar);
        if(monto>= (montoRetirar+ITF)){
            monto-= (montoRetirar+ITF);
            return true;
        } 
        return false;
    }
    public void abonarCuenta(double montoAbonar){       
        monto+= (montoAbonar-cobroITF(montoAbonar));
    }
    
    public String getTipo() {
        return tipo;
    }  
}
