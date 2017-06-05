/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catedra2_fmorales;

/**
 *
 * @author Francisco
 */
public class Lifo {
    private NodoLifo raiz;
    
    public void Insertar(int x){
        
    }
    public int Largo(){
        NodoLifo reco=raiz;
        int totalElementos=0;
        
        while(reco!=null){
            totalElementos++;
            reco=reco.sig;
        }
        return totalElementos;
    }
}
