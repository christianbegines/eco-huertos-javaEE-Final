/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecohuertos.model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author alumno
 */
@Entity
@Table(name="categorias")
@NamedQueries({
    @NamedQuery(name="categoria.findAll",query="SELECT categoria"
    + "FROM Categoria categoria ORDER BY categoria.id")
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Categoria  implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable=false,length=45)
    private String nombre;
    //private String icono;
    //private List<Categoria> subcategorias;

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        //this.icono = icono;
       // this.subcategorias = subcategorias;
    }

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 
    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
  }
  */
}
