package Entidades;

import javax.persistence.*;

//@Entity
public class Movimientos {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO) // --> Valor incremental 1 2 3 4 5
    //private Long id;
    private Integer monto;
    private String concepto;
    private String nombre; // --> Definir quien hizo la compra
    //@ManyToOne
    //@JoinColumn(name = "empleado_nombre")
    //private Empleado empleado;
    public Movimientos(Integer monto, String concepto, String nombre) {
        this.monto = monto;
        this.concepto = concepto;
        this.nombre = nombre;
    }

    public Movimientos() {
        this.monto = 0;
        this.concepto = "Sin Pago";
        this.nombre = "Diego Perez";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }
}
