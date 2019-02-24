/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnidadDos;

/**
 *
 * @author cobak
 */
public class MetodoBiseccion {
    
       /*****
   Miembros datos
   */
      double a, b, tol, p; //extremos y tolerancia
      int ni;//iteraciones
   
   /******
   Constructor
   */
       public MetodoBiseccion(double a1, double b1, double tol1,
            int ni1)
      {
         a = a1; b = b1; tol = tol1; ni = ni1;
      }
   
   /******
   Función de la que se calculará la raíz
   */
       private double f(double x){
      //  double r = x - Math.pow(2,-x);
         double r = Math.exp(x) - x*x + 3*x -2;
      //  double r = 2*x*Math.cos(2*x) - (x + 1)*(x + 1);
      //  double r = x*Math.cos(x)-2*x*x + 3*x -1;
         return r;
      }
   
   
   /******
   Metodo private: calcularRaices
   */
   
       public double calcularRaiz(){
         double p=a; 
         int i=1; 
         double eps=1;
      
         while(f(p)!=0 & i<=ni & eps>tol){
            double pa = p;
            p = (a+b)/2;
            if(f(p)*f(a)>0)
               a=p;
            else 
               if(f(p)*f(b)>0)
                  b=p;
            i = i + 1;
            eps = Math.abs(p-pa)/p;
         }
         return p;
      }
    
}
