package taller_ab;

public class Taller_AB {

    Nodo Raiz;
    int Tam;
    
    public boolean ItsEmpty(){
        return Raiz==null;
    }
    
    public void Insert(Estudiante info){
        Nodo nuevo=new Nodo(info);        
        if(ItsEmpty()){
            Raiz=nuevo;
        }else{
            Nodo aux=Raiz;
            Nodo Before=null;
            while (aux!=null) {
                Before=aux;
                nuevo.setDato(info); //Asignamos el nodo Padre
                if(info.getCodigoUnico() >= aux.getDato().getCodigoUnico()){
                    aux=aux.getDer();   // Obtenemos el hijo Derecho
                }else{
                    aux=aux.getIzq();   // Obtenemos el hijo Izquierdo
                }                
            }
            // Insertar el nuevo nodo en su lugar correspondiente
            if (info.getCodigoUnico() < Before.getDato().getCodigoUnico()) {
                Before.setIzq(nuevo);    //asignamos el hijo Izquierdo                
            }else{
                Before.setDer(nuevo);     //asignamos el hijo Derecho               
            }
             
        }
        Tam++;
    }
    
    //    RECORRIDO INORDEN
    public void PrintInOrden(Nodo nodo){
        if (nodo!=null) {
            PrintInOrden(nodo.getIzq());
            System.out.println(nodo.getDato().getCodigoUnico()+" - ");
            PrintInOrden(nodo.getDer());
        }
    }
    //    RECORRIDO PREORDEN
    public void PrintPreOrden(Nodo nodo){
        if (nodo!=null) {
            System.out.print(nodo.getDato().getCodigoUnico()+" - ");
            PrintInOrden(nodo.getIzq());            
            PrintInOrden(nodo.getDer());
        }
    }
    //    RECORRIDO POSTORDEN
    public void PrintPostOrden(Nodo nodo){
        if (nodo!=null) {            
            PrintInOrden(nodo.getIzq());            
            PrintInOrden(nodo.getDer());
            System.out.print(nodo.getDato().getCodigoUnico()+" - ");
        }
    }
    
    //      BUSCAR
    private void Search(Nodo nodo,int id){
        if (nodo!=null) {
            if (id==nodo.getDato().getCodigoUnico()) {
                System.out.println("Codico unico encontrado!!!");
            }
            
        Search(nodo.getIzq(),id);
        Search(nodo.getDer(),id);
        }
    }
    
    public void Search(int id){
        System.out.println("Codigo nuemero: "+id+" encontrado");
        Search(Raiz,id);
        System.out.println("");
    }
    
    //      TAMAÑO
    public void Size(){
        System.out.println("la cantidad de nodos insertados es de: "+Tam);
    }
    
}
