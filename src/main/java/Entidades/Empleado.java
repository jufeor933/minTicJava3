package Entidades;

import javax.persistence.*;
import java.util.List;

//@Entity // --> esta clase es una entidad --> Tablas
public class Empleado {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO) // --> Valor incremental 1 2 3 4 5
    //private Long id;
    private String email;
    private String nombre;
    private String empresa;
    private Boolean rol;
    //@OneToMany(mappedBy = "empleado")
    //private List <Movimientos> movimientosList;
    public Empleado(){
        this.email = "123@gmail.com";
        this.nombre = "Diego Perez";
        this.empresa = "Perficient";
        this.rol = true;
    }
    public Empleado(String email, String nombre, String empresa, Boolean rol) {
        this.email = email;
        this.nombre = nombre;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Boolean getRol() {
        return rol;
    }

    public void setRol(Boolean rol) {
        this.rol = rol;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }
}
