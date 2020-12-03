/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JLL
 */
@Entity
@Table(name = "series")
public class Serie {
    
    @Id
    @GeneratedValue
    @Column(name="ser_id")
    Long serId;
    
    @Column(name="ser_titulo")
    String serTitulo;
    
    @Column(name="ser_temporadas")
    Long serTemporadas;
    
    @Column(name="ser_capitulos")
    Long serCapitulos;

    public Long getSerId() {
        return serId;
    }

    public void setSerId(Long serId) {
        this.serId = serId;
    }

    public String getSerTitulo() {
        return serTitulo;
    }

    public void setSerTitulo(String serTitulo) {
        this.serTitulo = serTitulo;
    }

    public Long getSerTemporadas() {
        return serTemporadas;
    }

    public void setSerTemporadas(Long serTemporadas) {
        this.serTemporadas = serTemporadas;
    }

    public Long getSerCapitulos() {
        return serCapitulos;
    }

    public void setSerCapitulos(Long serCapitulos) {
        this.serCapitulos = serCapitulos;
    }

    @Override
    public String toString() {
        return "Serie{" + "serId=" + serId + ", serTitulo=" + serTitulo + ", serTemporadas=" + serTemporadas + ", serCapitulos=" + serCapitulos + '}';
    }
    
    
    
}
