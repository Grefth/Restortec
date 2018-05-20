/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Grefth
 */
@Entity
@Table(name = "nota_detalle_ventas")
@NamedQueries({
    @NamedQuery(name = "NotaDetalleVentas.findAll", query = "SELECT n FROM NotaDetalleVentas n")})
public class NotaDetalleVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nota_detalle_ventas")
    private Integer idNotaDetalleVentas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_clientes")
    private int idClientes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_empleado")
    private int idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forma_pago")
    private Character formaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_detalle_ventas")
    private int idDetalleVentas;

    public NotaDetalleVentas() {
    }

    public NotaDetalleVentas(Integer idNotaDetalleVentas) {
        this.idNotaDetalleVentas = idNotaDetalleVentas;
    }

    public NotaDetalleVentas(Integer idNotaDetalleVentas, int idClientes, Date fecha, int idEmpleado, Character formaPago, int idDetalleVentas) {
        this.idNotaDetalleVentas = idNotaDetalleVentas;
        this.idClientes = idClientes;
        this.fecha = fecha;
        this.idEmpleado = idEmpleado;
        this.formaPago = formaPago;
        this.idDetalleVentas = idDetalleVentas;
    }

    public Integer getIdNotaDetalleVentas() {
        return idNotaDetalleVentas;
    }

    public void setIdNotaDetalleVentas(Integer idNotaDetalleVentas) {
        this.idNotaDetalleVentas = idNotaDetalleVentas;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Character getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Character formaPago) {
        this.formaPago = formaPago;
    }

    public int getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public void setIdDetalleVentas(int idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotaDetalleVentas != null ? idNotaDetalleVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaDetalleVentas)) {
            return false;
        }
        NotaDetalleVentas other = (NotaDetalleVentas) object;
        if ((this.idNotaDetalleVentas == null && other.idNotaDetalleVentas != null) || (this.idNotaDetalleVentas != null && !this.idNotaDetalleVentas.equals(other.idNotaDetalleVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.NotaDetalleVentas[ idNotaDetalleVentas=" + idNotaDetalleVentas + " ]";
    }
    
}
