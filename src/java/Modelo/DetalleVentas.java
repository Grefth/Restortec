/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Grefth
 */
@Entity
@Table(name = "detalle_ventas")
@NamedQueries({
    @NamedQuery(name = "DetalleVentas.findAll", query = "SELECT d FROM DetalleVentas d")})
public class DetalleVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_detalle_ventas")
    private Integer idDetalleVentas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nota")
    private int idNota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_platillo")
    private int idPlatillo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;

    public DetalleVentas() {
    }

    public DetalleVentas(Integer idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public DetalleVentas(Integer idDetalleVentas, int idNota, int idPlatillo, int cantidad, double precio) {
        this.idDetalleVentas = idDetalleVentas;
        this.idNota = idNota;
        this.idPlatillo = idPlatillo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public void setIdDetalleVentas(Integer idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleVentas != null ? idDetalleVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVentas)) {
            return false;
        }
        DetalleVentas other = (DetalleVentas) object;
        if ((this.idDetalleVentas == null && other.idDetalleVentas != null) || (this.idDetalleVentas != null && !this.idDetalleVentas.equals(other.idDetalleVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.DetalleVentas[ idDetalleVentas=" + idDetalleVentas + " ]";
    }
    
}
