package biblioteca;

public class directorio extends libro{
    libro[] info = new libro[10];//espacio para 10 Libros
    int entradas = 0;
    String PalabraClave;
    int seleccion;

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
    
    
     public void IngresarLibroNuevo(){
        System.out.println("REGISTRO DE NUEVO LIBRO");
        System.out.println("Nombre: ");
        info[entradas] = new directorio();
        info[entradas].nombre = teclado.next();
        System.out.println("Autor: ");
        info[entradas].autor = teclado.next();
        System.out.println("Año de publicacion; ");
        info[entradas].AñoDePublicacion = teclado.nextInt();
        System.out.println("Código: ");
        info[entradas].codigo = teclado.next();
        System.out.println("Cantidad: ");
        info[entradas].cantidad = teclado.nextInt();
        System.out.println("Area: ");
        info[entradas].area = teclado.next();
        entradas++;
    }
     
     
        public void ActualizarLibro(){
            int id;
            System.out.println("ACTUALIZAR LIBRO");
            System.out.println("Ingrese Palabra Clace");
            PalabraClave = teclado.next();
            id=buscar();
            if(id==-1){}
            else{
                System.out.println("Nombre: ");     
                info[id].nombre = teclado.next();
                System.out.println("Autor: ");
                info[id].autor = teclado.next();
                System.out.println("Año de publicacion; ");
                info[id].AñoDePublicacion = teclado.nextInt();
                System.out.println("Código: ");
                info[id].codigo = teclado.next();
                System.out.println("Cantidad: ");
                info[id].cantidad = teclado.nextInt();
                System.out.println("Area: ");
                info[id].area = teclado.next();
            }
    }
        public int buscar(){
            int indice=0;
            
             for(int index=0; index<entradas; index++ ){
                if(PalabraClave.equals(info[index].nombre)){
                    indice = index;
                }
                else 
                    indice = -1;
            }   
             
             return indice;
        }
        
        public void ImprimirInfo(){
            int id;
            id=buscar();
            if(id==-1){}
            else{
                System.out.println("Nombre: "+info[id].nombre);
                System.out.println("Autor: "+info[id].autor);
                System.out.println("Año de publicacion; "+info[id].AñoDePublicacion);
                System.out.println("Código: "+info[id].codigo);
                System.out.println("Cantidad: "+info[id].cantidad);
                System.out.println("Area: "+info[id].area);
            }
        }
        
        public void Menu(){
            System.out.println("Seleccione la accion a realizar");
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Actualizar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Buscar Libro");
            seleccion = teclado.nextInt();
                       
        }
}