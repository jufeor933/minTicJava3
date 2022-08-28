package Entidades;

import javax.persistence.*;
import java.util.List;

@Entity // --> esta clase es una entidad --> Tablas

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // --> Valor incremental 1 2 3 4 5
    private Long id;

    private String nombre;
    private String email;
    private String empresa; // --> Relacion con Empresa
    private Boolean rol;

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



    @OneToMany(mappedBy = "empelado")
    private List <Movimientos> movimientosList;

    public Empleado(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }
}
