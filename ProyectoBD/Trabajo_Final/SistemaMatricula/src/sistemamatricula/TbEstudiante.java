/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemamatricula;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author LuisFernando
 */
@Entity
@Table(name = "tb_estudiante", catalog = "bdlogin", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbEstudiante.findAll", query = "SELECT t FROM TbEstudiante t"),
    @NamedQuery(name = "TbEstudiante.findByDatEstudiante", query = "SELECT t FROM TbEstudiante t WHERE t.datEstudiante = :datEstudiante"),
    @NamedQuery(name = "TbEstudiante.findByDatExpedienteAcademico", query = "SELECT t FROM TbEstudiante t WHERE t.datExpedienteAcademico = :datExpedienteAcademico"),
    @NamedQuery(name = "TbEstudiante.findByDatNombreCompleto", query = "SELECT t FROM TbEstudiante t WHERE t.datNombreCompleto = :datNombreCompleto"),
    @NamedQuery(name = "TbEstudiante.findByDatCedula", query = "SELECT t FROM TbEstudiante t WHERE t.datCedula = :datCedula"),
    @NamedQuery(name = "TbEstudiante.findByDatNacionalidad", query = "SELECT t FROM TbEstudiante t WHERE t.datNacionalidad = :datNacionalidad"),
    @NamedQuery(name = "TbEstudiante.findByDatProfesionPrincipal", query = "SELECT t FROM TbEstudiante t WHERE t.datProfesionPrincipal = :datProfesionPrincipal"),
    @NamedQuery(name = "TbEstudiante.findByDatFechaNacimiento", query = "SELECT t FROM TbEstudiante t WHERE t.datFechaNacimiento = :datFechaNacimiento"),
    @NamedQuery(name = "TbEstudiante.findByDatGenero", query = "SELECT t FROM TbEstudiante t WHERE t.datGenero = :datGenero"),
    @NamedQuery(name = "TbEstudiante.findByDatLugarNacimiento", query = "SELECT t FROM TbEstudiante t WHERE t.datLugarNacimiento = :datLugarNacimiento"),
    @NamedQuery(name = "TbEstudiante.findByDatDiscapacidad", query = "SELECT t FROM TbEstudiante t WHERE t.datDiscapacidad = :datDiscapacidad"),
    @NamedQuery(name = "TbEstudiante.findByDatInformacionAdicional", query = "SELECT t FROM TbEstudiante t WHERE t.datInformacionAdicional = :datInformacionAdicional")})
public class TbEstudiante implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "dat_estudiante")
    private Integer datEstudiante;
    @Basic(optional = false)
    @Column(name = "dat_expediente_academico")
    private String datExpedienteAcademico;
    @Basic(optional = false)
    @Column(name = "dat_nombre_completo")
    private String datNombreCompleto;
    @Id
    @Basic(optional = false)
    @Column(name = "dat_cedula")
    private Integer datCedula;
    @Basic(optional = false)
    @Column(name = "dat_nacionalidad")
    private String datNacionalidad;
    @Basic(optional = false)
    @Column(name = "dat_profesion_principal")
    private String datProfesionPrincipal;
    @Basic(optional = false)
    @Column(name = "dat_fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date datFechaNacimiento;
    @Basic(optional = false)
    @Column(name = "dat_genero")
    private String datGenero;
    @Basic(optional = false)
    @Column(name = "dat_lugar_nacimiento")
    private String datLugarNacimiento;
    @Basic(optional = false)
    @Column(name = "dat_discapacidad")
    private int datDiscapacidad;
    @Column(name = "dat_informacion_adicional")
    private String datInformacionAdicional;

    public TbEstudiante() {
    }

    public TbEstudiante(Integer datCedula) {
        this.datCedula = datCedula;
    }

    public TbEstudiante(Integer datCedula, String datExpedienteAcademico, String datNombreCompleto, String datNacionalidad, String datProfesionPrincipal, Date datFechaNacimiento, String datGenero, String datLugarNacimiento, int datDiscapacidad) {
        this.datCedula = datCedula;
        this.datExpedienteAcademico = datExpedienteAcademico;
        this.datNombreCompleto = datNombreCompleto;
        this.datNacionalidad = datNacionalidad;
        this.datProfesionPrincipal = datProfesionPrincipal;
        this.datFechaNacimiento = datFechaNacimiento;
        this.datGenero = datGenero;
        this.datLugarNacimiento = datLugarNacimiento;
        this.datDiscapacidad = datDiscapacidad;
    }

    public Integer getDatEstudiante() {
        return datEstudiante;
    }

    public void setDatEstudiante(Integer datEstudiante) {
        Integer oldDatEstudiante = this.datEstudiante;
        this.datEstudiante = datEstudiante;
        changeSupport.firePropertyChange("datEstudiante", oldDatEstudiante, datEstudiante);
    }

    public String getDatExpedienteAcademico() {
        return datExpedienteAcademico;
    }

    public void setDatExpedienteAcademico(String datExpedienteAcademico) {
        String oldDatExpedienteAcademico = this.datExpedienteAcademico;
        this.datExpedienteAcademico = datExpedienteAcademico;
        changeSupport.firePropertyChange("datExpedienteAcademico", oldDatExpedienteAcademico, datExpedienteAcademico);
    }

    public String getDatNombreCompleto() {
        return datNombreCompleto;
    }

    public void setDatNombreCompleto(String datNombreCompleto) {
        String oldDatNombreCompleto = this.datNombreCompleto;
        this.datNombreCompleto = datNombreCompleto;
        changeSupport.firePropertyChange("datNombreCompleto", oldDatNombreCompleto, datNombreCompleto);
    }

    public Integer getDatCedula() {
        return datCedula;
    }

    public void setDatCedula(Integer datCedula) {
        Integer oldDatCedula = this.datCedula;
        this.datCedula = datCedula;
        changeSupport.firePropertyChange("datCedula", oldDatCedula, datCedula);
    }

    public String getDatNacionalidad() {
        return datNacionalidad;
    }

    public void setDatNacionalidad(String datNacionalidad) {
        String oldDatNacionalidad = this.datNacionalidad;
        this.datNacionalidad = datNacionalidad;
        changeSupport.firePropertyChange("datNacionalidad", oldDatNacionalidad, datNacionalidad);
    }

    public String getDatProfesionPrincipal() {
        return datProfesionPrincipal;
    }

    public void setDatProfesionPrincipal(String datProfesionPrincipal) {
        String oldDatProfesionPrincipal = this.datProfesionPrincipal;
        this.datProfesionPrincipal = datProfesionPrincipal;
        changeSupport.firePropertyChange("datProfesionPrincipal", oldDatProfesionPrincipal, datProfesionPrincipal);
    }

    public Date getDatFechaNacimiento() {
        return datFechaNacimiento;
    }

    public void setDatFechaNacimiento(Date datFechaNacimiento) {
        Date oldDatFechaNacimiento = this.datFechaNacimiento;
        this.datFechaNacimiento = datFechaNacimiento;
        changeSupport.firePropertyChange("datFechaNacimiento", oldDatFechaNacimiento, datFechaNacimiento);
    }

    public String getDatGenero() {
        return datGenero;
    }

    public void setDatGenero(String datGenero) {
        String oldDatGenero = this.datGenero;
        this.datGenero = datGenero;
        changeSupport.firePropertyChange("datGenero", oldDatGenero, datGenero);
    }

    public String getDatLugarNacimiento() {
        return datLugarNacimiento;
    }

    public void setDatLugarNacimiento(String datLugarNacimiento) {
        String oldDatLugarNacimiento = this.datLugarNacimiento;
        this.datLugarNacimiento = datLugarNacimiento;
        changeSupport.firePropertyChange("datLugarNacimiento", oldDatLugarNacimiento, datLugarNacimiento);
    }

    public int getDatDiscapacidad() {
        return datDiscapacidad;
    }

    public void setDatDiscapacidad(int datDiscapacidad) {
        int oldDatDiscapacidad = this.datDiscapacidad;
        this.datDiscapacidad = datDiscapacidad;
        changeSupport.firePropertyChange("datDiscapacidad", oldDatDiscapacidad, datDiscapacidad);
    }

    public String getDatInformacionAdicional() {
        return datInformacionAdicional;
    }

    public void setDatInformacionAdicional(String datInformacionAdicional) {
        String oldDatInformacionAdicional = this.datInformacionAdicional;
        this.datInformacionAdicional = datInformacionAdicional;
        changeSupport.firePropertyChange("datInformacionAdicional", oldDatInformacionAdicional, datInformacionAdicional);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datCedula != null ? datCedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEstudiante)) {
            return false;
        }
        TbEstudiante other = (TbEstudiante) object;
        if ((this.datCedula == null && other.datCedula != null) || (this.datCedula != null && !this.datCedula.equals(other.datCedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistemamatricula.TbEstudiante[ datCedula=" + datCedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
