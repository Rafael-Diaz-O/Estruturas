
package estruturas;


public class Lista {
    
    private Nodo cabeza; 
    
    public Lista(){
        this.cabeza= null; 
    }
    
     public void insertarNodoInicio(int dato){
        Nodo nodoIni = new Nodo(dato);
        nodoIni.siguiente = cabeza; 
        cabeza = nodoIni; 
    }
     
     public void insertarNodoFinal(int dato){
         Nodo nodoFin = new Nodo(dato);
         Nodo nodoRecorre = cabeza; // hise una copia 
         
         while (nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente;
         }
         
         nodoRecorre.siguiente = nodoFin;
     }
}
