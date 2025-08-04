CREATE DATABASE EventosAPP;

USE EventosAPP;

CREATE TABLE Usuarios (
    UsuarioID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Email VARCHAR(50),
    Contrasena VARCHAR(50),
    Telefono VARCHAR(50),
    Fecha_Nacimiento DATE,
    Rol VARCHAR (15)
);


CREATE TABLE Eventos (
    EventoID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Descripcion TEXT,
    Fecha_Inicio DATE,
    Fecha_Fin DATE,
    Lugar VARCHAR(50),
    Hora TIME,
    Cantidad_Personas INT,
    Cantidad_Personas_Max INT,
    Cantidad_Personas_Min INT,
    ID_Usuario INT,
    FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(UsuarioID)
);


ALTER TABLE Usuarios
ADD COLUMN 


    
    

