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

   /******   Función de la que se calculará la raíz
   */
       private double f(double x){
         double r = (Math.pow(x,3)) - (4*Math.pow(x,2)) - 10;
         return r;
      }
   
   /******
   Metodo private: calcularRaices
   */
   
       public double calcularRaiz(double limInf, double limSup, double tol){ //Funcion Recursiva
         double p=limInf; 
         int i=1; 
         double eps=1;
         double ni= limSup-limInf;
         
         while(f(p)!=0 & i<=ni & eps>tol){
            double pa = p;
            p = (limInf+limSup)/2;
            if(f(p)*f(limInf)>0)
               limInf=p;
            else 
               if(f(p)*f(limSup)>0)
                  limSup=p;
            i = i + 1;
            eps = Math.abs(p-pa)/p;
         }
         return p;
      }
 //To change body of generated methods, choose Tools | Templates.
    }
