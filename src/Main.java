public class Main {
    public static void main(String[] args) {

        //Creacion de Objeto (persona)

        Persona persona = new Persona();


        //Asignacion de Atributos para el Objeto persona

        persona.setNombre("Denis");
        String nombre = persona.getNombre();
        System.out.println("Nombre: " + nombre);

        persona.setEdad(67);
        int edad = persona.getEdad();
        System.out.println("Edad: " + edad + " años");

        persona.setTelefono("+974-60787105");
        String telefono = persona.getTelefono();
        System.out.println("Telefono: " + telefono);
    }
}

//Definicion de clase (Persona)
class Persona {

    private String nombre;
    private int edad;
    private String telefono;


//Accesores de Atributo(s) de la clase Persona segun propiedad(es) (nombre, edad, telefono)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }


    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }


    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}