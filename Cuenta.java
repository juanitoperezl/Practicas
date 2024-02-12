/*Crear una clase llamada Cuenta que tendrá los siguientes atributos: 
titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crear dos 
constructores que cumpla lo anterior.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la 
cantidad introducida es negativa, no se hará nada.

retirar(double cantidad): se retira una cantidad a la cuenta, si restando 
la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta 
pasa a ser 0.*/
package tema_1_2;

/**
 *
 * @author enrique
 */
public class Cuenta {
    //atributos de la clase
    private String titular;
    private double cantidad;
    
    /*Constructor predeterminado*/
    public Cuenta()
    {
        this.titular = "";
        this.cantidad = 0.0;        
    }
    
    public Cuenta(String t)
    {
        this.titular = t;
    }
    
    public void setTitular( String nombre)
    {
        this.titular=nombre;
    }
    
    public String getTitular()
    {
     return this.titular;   
    }
    
    public void setCantidad( double c)
    {
        this.cantidad = c;
    }
    
    public double getCantidad()
    {
     return this.cantidad;   
    }    
    
    public void ingresar(double cantidad)
    {
     /*se ingresa una cantidad a la cuenta, si la cantidad 
        introducida es negativa, no se hará nada.*/
        if(cantidad > 0)
            this.cantidad += cantidad;
    }

    
    public void retirar(double cantidad){ 
    /*se retira una cantidad a la cuenta, si restando la cantidad 
      actual a la que nos pasan es negativa, la cantidad de la cuenta 
      pasa a ser 0.*/
    double resta;
    resta = this.cantidad - cantidad;
    if(resta <= 0)
    {
        this.cantidad = 0;
    }
    else
    {
        this.cantidad = resta;
    }
    }

    
}
