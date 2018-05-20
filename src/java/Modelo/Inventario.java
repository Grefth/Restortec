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
import javax.validation.constraints.Size;

/**
 *
 * @author Grefth
 */
@Entity
@Table(name = "inventario")
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_platillo")
    private Integer idPlatillo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Size(max = 100)
    @Column(name = "fecha_ultima_compra")
    private String fechaUltimaCompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "own_ultima_compra")
    private String ownUltimaCompra;

    public Inventario() {
    }

    public Inventario(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public Inventario(Integer idPlatillo, int cantidad, String ownUltimaCompra) {
        this.idPlatillo = idPlatillo;
        this.cantidad = cantidad;
        this.ownUltimaCompra = ownUltimaCompra;
    }

    public Integer getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(String fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    public String getOwnUltimaCompra() {
        return ownUltimaCompra;
    }

    public void setOwnUltimaCompra(String ownUltimaCompra) {
        this.ownUltimaCompra = ownUltimaCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlatillo != null ? idPlatillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.idPlatillo == null && other.idPlatillo != null) || (this.idPlatillo != null && !this.idPlatillo.equals(other.idPlatillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Inventario[ idPlatillo=" + idPlatillo + " ]";
    }
    
}
