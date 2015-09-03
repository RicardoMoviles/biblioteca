package biblioteca;

public class directorio extends libro{
    libro info[] = new libro[10];//espacio para 10 Libros
    libro prestamo[] = new libro[10];
    int entradas = 0;
    String PalabraClave;
    int seleccion;

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public String getPalabraClave() {
        return PalabraClave;
    }

    public void setPalabraClave(String PalabraClave) {
        this.PalabraClave = PalabraClave;
    }
    
    
     public void IngresarLibroNuevo(){
        System.out.println("REGISTRO DE NUEVO LIBRO");
        System.out.println("Nombre: ");
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
            id=buscar();
            if(id==-1){
            System.out.println("No encontrado");
            }
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
               
        public int buscar (){
            int indice=0;
            int index=0;
            System.out.println("Ingrese Palabra Clace");
            PalabraClave = teclado.next();
            for(index=0; index<entradas; index++ ){
                    if(PalabraClave.equals(info[index].nombre)){
                        indice = index;
                        index = entradas;
                    }
                    else {
                        indice = -1;
                    }
                
                
            }   
             return indice;
        }
        
        public void ImprimirInfo(){
            int id;
            id=buscar();
            if(id==-1){
            System.out.println("No encontrado");
            }
            else{
                System.out.println("Nombre: "+info[id].nombre);
                System.out.println("Autor: "+info[id].autor);
                System.out.println("Año de publicacion; "+info[id].AñoDePublicacion);
                System.out.println("Código: "+info[id].codigo);
                System.out.println("Cantidad: "+info[id].cantidad);
                System.out.println("Area: "+info[id].area);
            }
        }
                
        public void Borrar(){
            int id;
            id=buscar();
            if(id==-1){}
            else{
            info[id].nombre="No Disponible";
            info[id].autor="No Disponible";
            info[id].AñoDePublicacion=0000;
            info[id].codigo="No Disponible";
            info[id].cantidad=0;
            info[id].area="No Disponible";
            }
        }
        
        public void Menu1(){
            info[entradas] = new directorio();
            System.out.println("Seleccione la accion a realizar");
            System.out.println("1. Ajustes Datos Libros");
            System.out.println("2. Prestamos");
            seleccion = teclado.nextInt();
                       
        }
        
        public void Menu2(){
            System.out.println("Seleccione la accion a realizar");
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Actualizar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Buscar Libro");
            seleccion = teclado.nextInt();
                       
        }
        
        public void Menu3(){
            System.out.println("Seleccione la accion a realizar");
            System.out.println("1. Prestar Libro");
            System.out.println("2. Devolver Libro");
            System.out.println("3. Libros prestados");
            seleccion = teclado.nextInt();                       
        }
        
        public void Prestamos(){
            int id;
            id=buscar();
            if(id==-1){
                System.out.println("No encontrado");
            }
            else{
                if(info[id].cantidad==0){
                    System.out.println("No hay mas de este libro");
                }
                else{
                    info[id].cantidad= info[id].cantidad-1;
                    prestamo[id].nombre = info[id].nombre;
                    prestamo[id].autor = info[id].autor;
                    prestamo[id].AñoDePublicacion = info[id].AñoDePublicacion;
                    prestamo[id].codigo = info[id].codigo;
                    prestamo[id].cantidad = prestamo[id].cantidad+1;
                    prestamo[id].area = info[id].area;
                }
            }
        }
        
        public void Devolver(){
            int id;
            id=buscar();
            if(id==-1){
                System.out.println("No encontrado");
            }
            else{
                info[id].cantidad= info[id].cantidad+1;
                prestamo[id].cantidad = prestamo[id].cantidad-1;
            }
        }
        
        public void LibrosPrestados(){
            for(int i=0; i<10;i++){
                if(prestamo[i].cantidad==0){
                    
                }
                else{
                System.out.println("Nombre: "+prestamo[i].nombre);
                System.out.println("Autor: "+prestamo[i].autor);
                System.out.println("Año de publicacion; "+prestamo[i].AñoDePublicacion);
                System.out.println("Código: "+prestamo[i].codigo);
                System.out.println("Cantidad: "+prestamo[i].cantidad);
                System.out.println("Area: "+prestamo[i].area);
                System.out.println();
                }
            }
        }
        
        public void Llenar(){
            for(int i=0; i<10;i++){
                prestamo[i] = new directorio();
                prestamo[i].nombre = "null";
                prestamo[i].autor = "null";
                prestamo[i].AñoDePublicacion = 0;
                prestamo[i].codigo = "null";
                prestamo[i].cantidad = 0;
                prestamo[i].area = "null";
            }
        }
}
