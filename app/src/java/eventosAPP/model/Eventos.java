package eventosAPP.model;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;

private class Eventos{
    private int eventoID;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String lugar;
    private LocalTime hora;
    private int cantidadPersonas;
    private int cantidadPersonasMax;
    private int cantidadPersonasMin;
    private Usuario usuario;
    private ArrayList<Usuario> usuario;
    private ArrayList<Notificaciones> notificacion;
    private ArrayList<Mensajes> mensaje;

    public Eventos(int eventoID , String nombre , String descripcion , LocalDate fechaInicio, LocalDate fechaFin, String lugar, LocalTime hora, int cantidadPersonas, int cantidadPersonasMax, int cantidadPersonasMin, int usuario){
        this.eventoID = eventoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lugar = lugar;
        this.hora = hora;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadPersonasMax = cantidadPersonasMax;
        this.cantidadPersonasMin = cantidadPersonasMin;
        this.usuario = usuario;
        this.usuario = new ArrayList<>();
        this.notificacion = new ArrayList<>();
        this.mensaje = new ArrayList<>();
    }
    //getters y setters

        public int getEventoID(){
            return eventoID;
        }
        public void setEventoID(int eventoID){
            this.eventoID = eventoID;
        }

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre
        }

        public String getDescripcion(){
            return descripcion;
        }
        public void setDescripcion(String descripcion){
            this.descripcion = descripcion;
        }
        
        public LocalDate getFechaInicio(){
            return fechaInicio;
        }
        public void setFechaInicio(LocalDate fechaInicio){
            this.fechaInicio = fechaInicio;
        }

        public LocalDate getFechaFin(){
            return fechaFin;
        }
        public void setFechaFin(LocalDate fechaFin){
            this.fechaFin = fechaFin
        }

        public String getLugar(){
            return lugar;
        }
        public void setLugar(String lugar){
            this.lugar = lugar
        }

        public LocalTime getHora(){
            return hora;
        }
        public void setHora(LocalTime hora){
            this.hora = hora;
        }

        public int getCantidadPersonas(){
            return cantidadPersonas;
        }
        public void setCantidadPersonas(int cantidadPersonas){
            this.cantidadPersonas = cantidadPersonas;
        }

        public int getCantidadPersonasMax(){
            return cantidadPersonasMax;
        }
         public void setCantidadPersonasMax(int cantidadPersonasMax){
            this.cantidadPersonasMax = cantidadPersonasMax;
         }


}