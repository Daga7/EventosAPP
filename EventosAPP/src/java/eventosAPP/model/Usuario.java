package eventosAPP.model;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

//Clase  Usuarios
public class Usuario {
    private int usuarioID;
    private String nombres;
    private String apellidos;
    private String email;
    private String contrasena;
    private String telefono;
    private LocalDate fechaNacimiento  
    private String rol;
    private ArrayList<Eventos> eventos;
    private ArrayList<Notificaciones> notificaciones;
    private ArrayList<Mensajes> mensajes;

    // Constructor de la clase Usuario
    public Usuario( int usuarioID , String nombres, String apellidos, String email , String contrasena,String telefono,Sring fechaNacimiento, String rol) {
        this.usuarioID = usuarioID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.Rol = Rol;
        this.eventos = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
        this.mensajes = new ArrayList<>();
    }

    // getters y setters

        //gett Y sett usuarioID
        public String getUsuarioID() {
            return usuarioID;
        }
        public void setUsuraioID(int usuarioId){
            this.usuarioID =usuarioID;
        }
        
        //gett y sett Nombre
        public String getNombre() { 
            return nombre; 
        }
        public void setNombre(String nombre) { 
            this.nombre = nombre; 
        }
        
        //gett y sett Apellido
        public String getApellido() { 
            return apellido; 
        }
        public void setApellido(String apellidos) { 
            this.apellido = apellido; 
        }

        //gett y sett Email
        public String getEmail() { 
            return correo; 
        }
        public void setEmail(String email) { 
            this.email = email; 
        }

        //gett y sett contrasena
        public String getContrasena() { 
            return contrasena; 
        }
        public void setContrasena(String contrasena) { 
            this.contraseña = contraseña; 
        }

        //gett y sett Telefono
        public String getTelefono() { 
            return telefono; 
        }
        public void setTelefono(String telefono) { 
            this.telefono = telefono; 
        }

        //gett y sett FechaNacimiento
        public String getFechaNacimiento() { 
            return fechaNacimiento; 
        }
        public void setFechaNacimiento(String fechaNacimiento) { 
            this.fechaNacimiento = fechaNacimiento; 
        }

        //gett y sett Rol
        public String getRol() { 
            return rol; 
        }
        public void setRol(String rol) { 
            this.rol = rol; 
        }

        //gett Lista eventos
        public ArrayList<Eventos> geteventos(){
            return eventos;
        }

        //get Lista notificaciones 
        public ArrayList<Notificacions> getnotificaciones(){
            return notificaciones;
        }

        //gett Lista mensajes 
        public ArrayList<Mensajes> getmensajes(){
            return mensajes;
        }


        //Metodo comportamiento usuario

        //Metodo vetificacion de Rol y permisos 
            // Arreglar el tema de que pueda cambair el evento 
        public boolean esOrganizador(){
            return this.rol.equalsIgnoreCase("organizador");
        }

        if (usuario.esOrganizador()){
            System.out.println("TIene permisos para modificar el evento");
        }else{
            System.out.println("No tiene permisos para modificar el evento , solo recibira notificaciones");
        }

    
}
