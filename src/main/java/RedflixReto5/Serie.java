/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedflixReto5;

/**
 *
 * @author JLL
 */
public class Serie {
    
    private final String serTitulo;
    private final int serTemporadas;
    private final int serCapitulos;

    public Serie(String serTitulo, int serTemporadas, int serCapitulos) {
        this.serTitulo = serTitulo;
        this.serTemporadas = serTemporadas;
        this.serCapitulos = serCapitulos;
    }

    public String getSerTitulo() {
        return this.serTitulo;
    }

    public int getSerCapitulos() {
        return this.serTemporadas;
    }

    public int getSerTemporadas() {
        return this.serCapitulos;
    }
    
    
    
}
