package eventosAPP.model;
import java.util.ArrayList;
import java.util.List;

//Atributos Usuarios

public class Usuario {
    private int id;
    private String Nombres;
    private String Apellidos;
    private String Email;
    private String Contrasena;
    private String Telefono;
    private String fechaNacimiento;    
    private String Rol;
    private ArrayList<Evento> eventos;
    private ArrayList<Notificacion> notificaciones;
    private ArrayList<Mensaje> mensajes;

    // Constructor de la clase Usuario
    public Usuario(String nombres, String apellidos, String correo, String contraseña,String telefono, String rol, String fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.eventos = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
        this.mensajes = new ArrayList<>();
    }
        public String getNombres() { return nombres; }
        public void setNombres(String nombres) { this.nombres = nombres; }

        public String getApellidos() { return apellidos; }
        public void setApellidos(String apellidos) { this.apellidos = apellidos; }

        public String getCorreo() { return correo; }
        public void setCorreo(String correo) { this.correo = correo; }

        public String getContraseña() { return contraseña; }
        public void setContraseña(String contraseña) { this.contraseña = contraseña; }

        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }

        public String getRol() { return rol; }
        public void setRol(String rol) { this.rol = rol; }

        public String getFechaNacimiento() { return fechaNacimiento; }
        public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

        //Metodo para verificar si el usuario es organizador
        public boolean esOrganizador(){
            return this.rol.equalsIgnoreCase("organizador");
        }

        if (usuario.esOrganizador()){
            System.out.println("TIene permisos para modificar el evento");
        }else{
            System.out.println("No tiene permisos para modificar el evento , solo recibira notificaciones");
        }

    
}
