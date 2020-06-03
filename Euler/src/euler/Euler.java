/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author amton
 */
public class Euler {

    
    public static void main(String[] args) {
        freuler a=new freuler();
        a.setVisible(true);
        
    }
    public static void euler(double xf){
            double y=1,x=0.0,step=0.01;
            System.out.println("Metodo de Euler");
            System.out.println("x\ty");
            for(double i=step;i<=xf;i+=step){
               y=y+step*y;
               x=x+step;
               System.out.println(x+"\t"+y);
            }
         }
    
    public static double funcion(double x, double y){
     double temp;
     temp = 2*x+y;
     return temp;
     }
    
}
