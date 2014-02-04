/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemamatricula;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author LuisFernando
 */
@Entity
@Table(name = "tb_componente_educativo", catalog = "bdlogin", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbComponenteEducativo.findAll", query = "SELECT t FROM TbComponenteEducativo t"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatComponenteEducativo", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datComponenteEducativo = :datComponenteEducativo"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatConfiguracionComponente", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datConfiguracionComponente = :datConfiguracionComponente"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatCodigo", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datCodigo = :datCodigo"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatNombre", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datNombre = :datNombre"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatUnidadAcademica", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datUnidadAcademica = :datUnidadAcademica"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatAreaFormacion", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datAreaFormacion = :datAreaFormacion"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatTipo", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datTipo = :datTipo"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatCompetencias", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datCompetencias = :datCompetencias"),
    @NamedQuery(name = "TbComponenteEducativo.findByDatCreditosAcademicos", query = "SELECT t FROM TbComponenteEducativo t WHERE t.datCreditosAcademicos = :datCreditosAcademicos")})
public class TbComponenteEducativo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dat_componente_educativo")
    private String datComponenteEducativo;
    @Basic(optional = false)
    @Column(name = "dat_configuracion_componente")
    private String datConfiguracionComponente;
    @Basic(optional = false)
    @Column(name = "dat_codigo")
    private String datCodigo;
    @Basic(optional = false)
    @Column(name = "dat_nombre")
    private String datNombre;
    @Basic(optional = false)
    @Column(name = "dat_unidad_academica")
    private String datUnidadAcademica;
    @Basic(optional = false)
    @Column(name = "dat_area_formacion")
    private String datAreaFormacion;
    @Basic(optional = false)
    @Column(name = "dat_tipo")
    private String datTipo;
    @Basic(optional = false)
    @Column(name = "dat_competencias")
    private String datCompetencias;
    @Basic(optional = false)
    @Column(name = "dat_creditos_academicos")
    private String datCreditosAcademicos;

    public TbComponenteEducativo() {
    }

    public TbComponenteEducativo(String datComponenteEducativo) {
        this.datComponenteEducativo = datComponenteEducativo;
    }

    public TbComponenteEducativo(String datComponenteEducativo, String datConfiguracionComponente, String datCodigo, String datNombre, String datUnidadAcademica, String datAreaFormacion, String datTipo, String datCompetencias, String datCreditosAcademicos) {
        this.datComponenteEducativo = datComponenteEducativo;
        this.datConfiguracionComponente = datConfiguracionComponente;
        this.datCodigo = datCodigo;
        this.datNombre = datNombre;
        this.datUnidadAcademica = datUnidadAcademica;
        this.datAreaFormacion = datAreaFormacion;
        this.datTipo = datTipo;
        this.datCompetencias = datCompetencias;
        this.datCreditosAcademicos = datCreditosAcademicos;
    }

    public String getDatComponenteEducativo() {
        return datComponenteEducativo;
    }

    public void setDatComponenteEducativo(String datComponenteEducativo) {
        String oldDatComponenteEducativo = this.datComponenteEducativo;
        this.datComponenteEducativo = datComponenteEducativo;
        changeSupport.firePropertyChange("datComponenteEducativo", oldDatComponenteEducativo, datComponenteEducativo);
    }

    public String getDatConfiguracionComponente() {
        return datConfiguracionComponente;
    }

    public void setDatConfiguracionComponente(String datConfiguracionComponente) {
        String oldDatConfiguracionComponente = this.datConfiguracionComponente;
        this.datConfiguracionComponente = datConfiguracionComponente;
        changeSupport.firePropertyChange("datConfiguracionComponente", oldDatConfiguracionComponente, datConfiguracionComponente);
    }

    public String getDatCodigo() {
        return datCodigo;
    }

    public void setDatCodigo(String datCodigo) {
        String oldDatCodigo = this.datCodigo;
        this.datCodigo = datCodigo;
        changeSupport.firePropertyChange("datCodigo", oldDatCodigo, datCodigo);
    }

    public String getDatNombre() {
        return datNombre;
    }

    public void setDatNombre(String datNombre) {
        String oldDatNombre = this.datNombre;
        this.datNombre = datNombre;
        changeSupport.firePropertyChange("datNombre", oldDatNombre, datNombre);
    }

    public String getDatUnidadAcademica() {
        return datUnidadAcademica;
    }

    public void setDatUnidadAcademica(String datUnidadAcademica) {
        String oldDatUnidadAcademica = this.datUnidadAcademica;
        this.datUnidadAcademica = datUnidadAcademica;
        changeSupport.firePropertyChange("datUnidadAcademica", oldDatUnidadAcademica, datUnidadAcademica);
    }

    public String getDatAreaFormacion() {
        return datAreaFormacion;
    }

    public void setDatAreaFormacion(String datAreaFormacion) {
        String oldDatAreaFormacion = this.datAreaFormacion;
        this.datAreaFormacion = datAreaFormacion;
        changeSupport.firePropertyChange("datAreaFormacion", oldDatAreaFormacion, datAreaFormacion);
    }

    public String getDatTipo() {
        return datTipo;
    }

    public void setDatTipo(String datTipo) {
        String oldDatTipo = this.datTipo;
        this.datTipo = datTipo;
        changeSupport.firePropertyChange("datTipo", oldDatTipo, datTipo);
    }

    public String getDatCompetencias() {
        return datCompetencias;
    }

    public void setDatCompetencias(String datCompetencias) {
        String oldDatCompetencias = this.datCompetencias;
        this.datCompetencias = datCompetencias;
        changeSupport.firePropertyChange("datCompetencias", oldDatCompetencias, datCompetencias);
    }

    public String getDatCreditosAcademicos() {
        return datCreditosAcademicos;
    }

    public void setDatCreditosAcademicos(String datCreditosAcademicos) {
        String oldDatCreditosAcademicos = this.datCreditosAcademicos;
        this.datCreditosAcademicos = datCreditosAcademicos;
        changeSupport.firePropertyChange("datCreditosAcademicos", oldDatCreditosAcademicos, datCreditosAcademicos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datComponenteEducativo != null ? datComponenteEducativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbComponenteEducativo)) {
            return false;
        }
        TbComponenteEducativo other = (TbComponenteEducativo) object;
        if ((this.datComponenteEducativo == null && other.datComponenteEducativo != null) || (this.datComponenteEducativo != null && !this.datComponenteEducativo.equals(other.datComponenteEducativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistemamatricula.TbComponenteEducativo[ datComponenteEducativo=" + datComponenteEducativo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
