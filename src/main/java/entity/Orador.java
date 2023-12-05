/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author Luciana Calvi
 */
public class Orador {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String mail;
    private String tema;
    private LocalDate fechaAlta;

    

    public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.tema = tema;
        this.fechaAlta = fechaAlta;
    }
    
   

    public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.tema = tema;
        this.fechaAlta = fechaAlta;
        
    }

    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
       
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre!=null){
        this.nombre = nombre;
        }else{
            this.nombre = "N/D";
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Orador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema=" + tema + ", fechaAlta=" + fechaAlta + '}';
    }
    
}
