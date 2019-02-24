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
public class Newton {
    
    	double x0, tol;
	int nIter;
	
	Newton(double x1, double tol1, int i){
		x0 = x1; 
		tol = tol1; 
		nIter = i;
	}
	
	private double f(double x){
		double y = (0.01*x + 1)*Math.sin(x)- (x - 0.01)/(Math.pow(x,2) + 1) - 0.0096;
		return y;
	}
	
	public void calculaRaiz(){
		double x = x0, xb = x-999;
		double n = 0, del_x = 0.01;

		while(Math.abs(x-xb)>tol){
			n = n+1; 
			xb = x;
  			if(n > nIter) break;
  			double y = f(x);
  			double y_driv=(f(x+del_x) - y)/del_x;
  			x = xb - y/y_driv;
  			System.out.println(" n="+n+" x= "+x+" y = "+y);
//  fprintf(' yd = %12.5e \n', y_driv)
		}
		System.out.println("Respuesta final = "+ x);
	}
    
}
