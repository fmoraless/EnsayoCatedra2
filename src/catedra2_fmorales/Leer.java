
package catedra2_fmorales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leer {
    public static String dato(){
        String sdato="";
        try{
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            sdato=bf.readLine();
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        return sdato;
    }
   public static int datoInt(){
        try{
            return Integer.parseInt(dato());
        }catch (NumberFormatException e){
            return Integer.MIN_VALUE;
        }
    } 
}
