/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnidadDos;
import java.util.Scanner;

public class MetodoSecante {

    double Xo, X1;
    int iteraciones;
    double tolerancia,funcion, error;
    
    
    public MetodoSecante(Scanner s) {
        leerTolerancia(s);
        leerIteraciones(s);
        leerXo(s);
        leerX1(s);
        
        //Evaluamos Yo
        double Yo = evaluarFuncion(Xo);
        //hacemos las primeras comprobaciones y si no caemos en ellas entonces ejecutamos el ciclo
        if(Yo==0) System.out.println("Xo "+Xo+" es una raiz");
        else {
            //inicialmente Xo no es una raiz asi que preparamos todo para ejecutar el ciclo
            //y procedemos a ejecutarlo
            double Y1 = evaluarFuncion(X1);
            double denominador = Y1-Yo;
            error = tolerancia+1;
            int contador = 0; //Contador para controlar el numero de iteraciones
            while((contador<iteraciones)&&(error>tolerancia)&&(Y1!=0)&&(denominador!=0)){
                double X2 = X1 - (Y1*(X1-Xo)/denominador);
                Xo = X1;
                Yo = Y1;
                X1 = X2;
                Y1 = evaluarFuncion(X2);
                denominador = Y1-Yo;
                error = Math.abs(X1-Xo);
                contador++;
            }
            //Segun los resultados del ciclo mostramos
            if(denominador==0) System.out.println("Excepcion en el denominador, division por cero");
            else{
                if(Y1 == 0) System.out.println("X1 "+X1+" es una raiz");
                else if (error<=tolerancia) System.out.println("X1 "+X1+" es una raiz y tiene un error absoluto de "+error);
                else System.out.println("Fallo la ejecucion del metodo");
            }
        }
    }
    
    public double evaluarFuncion(double x){
        funcion = Math.cos(1)-3*(x);// Escribir aca la funciÃ³n a evaluar, X es el parametro a usar
        
        return funcion;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MetodoSecante MS = new MetodoSecante(s);
    }
    
    public void leerTolerancia(Scanner s){
        System.out.println("Inserte Valor tolerancia:");
        try {
            tolerancia = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerTolerancia(s);
        }
    }
    
    public void leerIteraciones(Scanner s){
        System.out.println("Inserte numero de iteraciones:");
        try {
            iteraciones = Integer.parseInt(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerIteraciones(s);
        }
    }
    
    public void leerXo(Scanner s){
        System.out.println("Inserte Valor Xo:");
        try {
            Xo = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerXo(s);
        }
    }
    
    public void leerX1(Scanner s){
        System.out.println("Inserte Valor X1:");
        try {
            X1 = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerX1(s);
        }
    }
}
