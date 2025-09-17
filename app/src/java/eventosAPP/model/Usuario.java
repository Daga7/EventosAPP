package eventosAPP.model;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

//CORREGIR ERRORES DE ESCRITURA 
//Clase  Usuarios
public class Usuario {
    private int usuarioID;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String rol;
    private ArrayList<Evento> evento;
    private ArrayList<Notificacion> notificacion;
    private ArrayList<Mensaje> mensaje;

    // Constructor de la clase Usuario
    public Usuario( int usuarioID , String nombre, String apellido, String email , String contrasena, String telefono, LocalDate fechaNacimiento, String rol) {
        this.usuarioID = usuarioID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.evento = new ArrayList<>();
        this.notificacion = new ArrayList<>();
        this.mensaje = new ArrayList<>();
    }

    // getters y setters

    
        public int getUsuarioID() {
            return usuarioID;
        }
        public void setUsuarioID(int usuarioID){
            this.usuarioID =usuarioID;
        }
        
   
        public String getNombre() { 
            return nombre; 
        }
        public void setNombre(String nombre) { 
            this.nombre = nombre; 
        }
        
    
        public String getApellido() { 
            return apellido; 
        }
        public void setApellido(String apellidos) { 
            this.apellido = apellido; 
        }

     
        public String getEmail() { 
            return email; 
        }
        public void setEmail(String email) { 
            this.email = email; 
        }

        
        public String getContrasena() { 
            return contrasena; 
        }
        public void setContrasena(String contrasena) { 
            this.contrasena = contrasena; 
        }

      
        public String getTelefono() { 
            return telefono; 
        }
        public void setTelefono(String telefono) { 
            this.telefono = telefono; 
        }

    
        public LocalDate getFechaNacimiento() { 
            return fechaNacimiento; 
        }
        public void setFechaNacimiento(LocalDate fechaNacimiento) { 
            this.fechaNacimiento = fechaNacimiento; 
        }

       
        public String getRol() { 
            return rol; 
        }
        public void setRol(String rol) { 
            this.rol = rol; 
        }

      
        public ArrayList<Evento> getEvento(){
            return evento;
        }

        
        public ArrayList<Notificacion> getNotificacion(){
            return notificacion;
        }

       
        public ArrayList<Mensaje> getMensaje(){
            return mensaje;
        }


        //Metodo comportamiento usuario

        //Metodo vetificacion de Rol y permisos 
            // Arreglar el tema de que pueda cambair el evento 
        public boolean esOrganizador() {
            return this.rol != null && this.rol.equalsIgnoreCase("organizador");
        }
        
            // Método para mostrar los permisos
        public void mostrarPermisos() {
            if (esOrganizador()) {
                System.out.println("Tiene permisos para modificar el evento.");
            } else {
                System.out.println("No tiene permisos para modificar el evento, solo recibirá notificaciones.");
            }
        }
}
