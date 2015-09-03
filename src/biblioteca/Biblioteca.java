package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        
        int opcion;
        int ciclo=1;
        directorio persona1;
        persona1 = new directorio();
        persona1.Menu();
        opcion = persona1.getSeleccion();
        while(ciclo==1){    
            switch(opcion){
                case 1:
                    persona1.IngresarLibroNuevo();
                break;
                case 2:
                    
                    persona1.ActualizarLibro();
                break;
                case 3:
                break;
                case 4:
                    persona1.ImprimirInfo();
                break;
            }
        }
    }
    
}
