package Entidades;

import javax.persistence.*;

//@Entity
public class Empresa {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;
    //@ManyToOne
    //@JoinColumn(name = "empleado_nombre")


    public Empresa() {
        this.nombre = "Perficient";
        this.direccion = "calle 456";
        this.telefono = "333-444-6789";
        this.nit = "9876543-0";
    }
    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
