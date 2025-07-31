package eventosAPP.model;

//Ingresando atributos de los usuarios
public class Usuario {
    private String nombres;
    private String apellidos;
    private String correo,
    private String contraseña;
    private String telefono;
    private String rol;
    private String fechaNacimiento;
    private Arraylist<Evento> eventos;
    private Arraylist<Notificacion> notificaciones;
    private Arraylist<Mensaje> mensajes;
};

//Ingresando constructor de la clase Usuario
public USuario(String nombres, String apellidos, String correo, String contraseña, String telefono, String rol, String fechaNacimiento){
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.correo = correo;
    this.contraseña = contraseña;
    this.telefono = telefono;
    this.rol = rol;
    this.fechaNacimiento = fechaNacimiento;
    this.eventos = new Arraylist<>();
    this.notificaciones = new Arraylist<>();
    this.mensajes = new Arraylist<>();
};

//Ingresando getters y setters de la clase Usuario
