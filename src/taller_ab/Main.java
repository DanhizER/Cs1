package taller_ab;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Taller_AB Tree = new Taller_AB();
        int opc=0;                           
        
        do {      
            opc=Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.Validar el estado del arbol\n2.Insertar nodo al arbol\n3.Recorrer el arbol\n"
                    + "4.Comprobar la cantidad de nodos que tiene el arbol\n5.Buscar\n6.Salir"));
            switch (opc) {
                case 1:
                    //Validar el estado del arbol
                    System.out.print("El arbol esta vacio?: "+ Tree.ItsEmpty());
                    break;
                case 2:
                    //Insertar nodo al arbol                  
                    Tree.Insert(AddInfo());
                    break; 
                case 3:
                    //Recorrer e imprimir el arbol PreOrden, InOrden y PostOrden   
                    System.out.println("__________PREORDEN__________");
                    Tree.PrintPreOrden(Tree.Raiz);                    
                    System.out.println("\n___________INORDEN__________");
                    Tree.PrintInOrden(Tree.Raiz);
                    System.out.println("\n__________POSTORDEN_________");
                    Tree.PrintPostOrden(Tree.Raiz);                    
                    break;
                case 4:
                    //Comprobar la cantidad de nodos que tiene el arbol
                    System.out.println("");
                    Tree.Size();
                    break;
                case 5:
                    //buscar
                    int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo unico de estudiante a buscar: "));
                    Tree.Search(id);
                    break;
                case 6:
                    //Salir
                    System.out.println("Saliendo del programa...");
                    break;
            }
            
        } while(opc!=6);
    }
    
    public static Estudiante AddInfo(){
        String Nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona");        
        int ID=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de documento de la persona"));
        int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
        Estudiante E = new Estudiante(ID,Nombre,Edad);
        
        return E;
    }
}
