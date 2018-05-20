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
@Table(name = "promociones")
@NamedQueries({
    @NamedQuery(name = "Promociones.findAll", query = "SELECT p FROM Promociones p")})
public class Promociones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPromociones")
    private Integer idPromociones;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "id_empleado")
    private String idEmpleado;

    public Promociones() {
    }

    public Promociones(Integer idPromociones) {
        this.idPromociones = idPromociones;
    }

    public Promociones(Integer idPromociones, String idEmpleado) {
        this.idPromociones = idPromociones;
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(Integer idPromociones) {
        this.idPromociones = idPromociones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPromociones != null ? idPromociones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promociones)) {
            return false;
        }
        Promociones other = (Promociones) object;
        if ((this.idPromociones == null && other.idPromociones != null) || (this.idPromociones != null && !this.idPromociones.equals(other.idPromociones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Promociones[ idPromociones=" + idPromociones + " ]";
    }
    
}
