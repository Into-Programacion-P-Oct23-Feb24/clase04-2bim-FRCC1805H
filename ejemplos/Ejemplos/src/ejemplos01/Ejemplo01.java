/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //obtemos un procedimiento y despues le damos valores a esta operamos 
        //dentro y presentamos mediante una cadena final y return .
       
        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7,50);
        String miMensaje =obtenerMultiplicacionDos(7,50);
        System.out.printf("%s\n",miMensaje);
    }
    
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        String cadenafinal = " ";
        int resultado = 0;
        for (int i = 1; i <= limite ;i++){
           resultado = tabla * i;
           cadenafinal = String.format("%s%d * %d = %d\n", cadenafinal,
                   tabla,i,resultado);
           
        System.out.printf("%s\n", cadenafinal );
        
    }
    
        public static String obtenerMultiplicacionDos(int tabla,int limite){
        String cadenafinal = " ";
        int resultado = 0;
        for (int i = 1; i <= limite ;i++){
           resultado = tabla * i;
           cadenafinal = String.format("%s%d * %d = %d\n", cadenafinal,
                   tabla,i,resultado);
        }
        return cadenafinal;
        }
        
    public static String obtenerNombre(){
        return "Luis";
    }
    

}
