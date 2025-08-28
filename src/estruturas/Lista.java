
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
}
