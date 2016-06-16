/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memoriavirtual;

/**
 *
 * @author Raquel Calado
 */
public class PaginaVirtual {

    
    //Indica true se a página foi referenciada e false caso contrário.
    private boolean referenciada; 
    //Vai controlar o uso da página.
    //Se esta determinada posição da memória virtual foi modificada true e false se não.
    private boolean modificada;
    //Identifica que páginas estão fisicamente presentes na memória, sendo true pra presente e false pra ausente.
    private boolean presenteAusente;
    //Número da moldura física na qual a página está localizada
    private int numeroMolduraPagina;

    public PaginaVirtual(boolean referenciada, boolean modificada, boolean presenteAusente, int numeroMolduraPagina) {
        this.referenciada = referenciada;
        this.modificada = modificada;
        this.presenteAusente = presenteAusente;
        this.numeroMolduraPagina = numeroMolduraPagina;
    }

    public PaginaVirtual() {
    }
    
    

    public boolean isReferenciada() {
        return referenciada;
    }

    public void setReferenciada(boolean referenciada) {
        this.referenciada = referenciada;
    }

    public boolean isModificada() {
        return modificada;
    }

    public void setModificada(boolean modificada) {
        this.modificada = modificada;
    }

    public boolean isPresenteAusente() {
        return presenteAusente;
    }

    public void setPresenteAusente(boolean presenteAusente) {
        this.presenteAusente = presenteAusente;
    }

    public int getNumeroMolduraPagina() {
        return numeroMolduraPagina;
    }

    public void setNumeroMolduraPagina(int numeroMolduraPagina) {
        this.numeroMolduraPagina = numeroMolduraPagina;
    }
    
    
    
}
