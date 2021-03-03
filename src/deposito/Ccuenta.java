/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

/**
 *
 * @author AndresEntornos
 */
public class Ccuenta {

    public String nombre;
    public String cuenta;
    public double saldo;
    public double tipoInterés;
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    

    public Ccuenta() 
    {
    }

    public Ccuenta(String nom, String cue, double sal, double tipo) 
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    public double estado()
    {
        return getSaldo();
    }
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) 
            throw new Exception("No se puede ingresar cantidad negativa");
        setSaldo(getSaldo() + cantidad);
            
        
    }
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad<0) 
            throw new Exception("No se puede retirar una cantidad negativa");
        
        if (estado()< cantidad) 
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
        
    }
    
     
}
