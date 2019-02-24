/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnidadUno;
import java.math.*;

/**
 *
 * @author Dzul Canul Jesus geovany
 */
public class metodoss 
{//inicio de la clase 
  
    public double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    
    public double truncamientoDecimal(int numeroDecimales,double decimal){
    decimal = decimal*(java.lang.Math.pow(10, numeroDecimales));
    decimal = java.lang.Math.round(decimal);
    decimal = decimal/java.lang.Math.pow(10, numeroDecimales);

    return decimal;  }
    
    public double Error_absoluto(double va_verdadero, double va_aproximado)
    {
        double error_a = (va_verdadero - va_aproximado);
        return Math.abs(error_a);
    }
    public double Error_relativo(double va_real, double va_aprox)
    {
        double error_re=this.Error_absoluto(va_real, va_aprox)/va_real;
        
        return error_re;
    }
    public double Error_relativo_porcentual(double va_real, double va_aprox)
    {
       double error_re_po=this.Error_relativo(va_real, va_aprox)*100;
        
       return error_re_po;
    }
}//Fin de la clase
