
package catedra2_fmorales;

public class Catedra2_fmorales {

    
    public static void main(String[] args) {
        int maxelementospila=0;
        do{
            System.out.print("Ingrese cantidad maxima de elementos para la Pila (Mayor a 0)");
            maxelementospila = Leer.datoInt();
        }while(maxelementospila==0);
        
        do{
            Limpiar.cls();
            System.out.println("SEG >> " + "\n"+maxelementospila);
            System.out.println("MENU PRINCIPAL" + "\n");
            System.out.println("1) INGRESER DATOS");
            System.out.println("2) MOSTRAR DATOS");
            System.out.println("3) ELIMINAR DATOS"); /* Catedra 2*/
            System.out.println("4) SUMAR DATOS");
            System.out.println("5) ORDERNAR DATOS");/* Catedra 2*/
            System.out.println("6) BUSCAR DATOS");
            System.out.println("7) SALIR");
            System.out.println("Ingrese su Opción: ");
            op=Leer.datoInt();
            
            SelPila(op,P,maxelementospila);
        }while(op != 7);
    }
    
}
