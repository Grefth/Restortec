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
@Table(name = "nota_temp")
@NamedQueries({
    @NamedQuery(name = "NotaTemp.findAll", query = "SELECT n FROM NotaTemp n")})
public class NotaTemp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nota_temp")
    private Integer idNotaTemp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_platillo")
    private int idPlatillo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_clientes")
    private int idClientes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status_nota")
    private short statusnota;

    public NotaTemp() {
    }

    public NotaTemp(Integer idNotaTemp) {
        this.idNotaTemp = idNotaTemp;
    }

    public NotaTemp(Integer idNotaTemp, int idPlatillo, int cantidad, int idClientes, Date fecha, short statusnota) {
        this.idNotaTemp = idNotaTemp;
        this.idPlatillo = idPlatillo;
        this.cantidad = cantidad;
        this.idClientes = idClientes;
        this.fecha = fecha;
        this.statusnota = statusnota;
    }

    public Integer getIdNotaTemp() {
        return idNotaTemp;
    }

    public void setIdNotaTemp(Integer idNotaTemp) {
        this.idNotaTemp = idNotaTemp;
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

    public short getStatusnota() {
        return statusnota;
    }

    public void setStatusnota(short statusnota) {
        this.statusnota = statusnota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotaTemp != null ? idNotaTemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaTemp)) {
            return false;
        }
        NotaTemp other = (NotaTemp) object;
        if ((this.idNotaTemp == null && other.idNotaTemp != null) || (this.idNotaTemp != null && !this.idNotaTemp.equals(other.idNotaTemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.NotaTemp[ idNotaTemp=" + idNotaTemp + " ]";
    }
    
}
