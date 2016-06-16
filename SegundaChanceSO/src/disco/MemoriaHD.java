/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package disco;

/**
 *
 * @author Raquel Calado
 */
public class MemoriaHD {
    //Vai ser usado pra buscar o endereço na memória virtual
    //É o indíce da tabela onde ela está.
    private int indiceMemoriaVirtual;
    //Valor que será usado para gravar na moldura de página relacionada a memoria virtual.
    private int valorMemoriaFisica;

    public MemoriaHD(int indiceMemoriaVirtual, int valorMemoriaFisica) {
        this.indiceMemoriaVirtual = indiceMemoriaVirtual;
        this.valorMemoriaFisica = valorMemoriaFisica;
    }

    public MemoriaHD() {
    }
    

    public int getIndiceMemoriaVirtual() {
        return indiceMemoriaVirtual;
    }

    public void setIndiceMemoriaVirtual(int indiceMemoriaVirtual) {
        this.indiceMemoriaVirtual = indiceMemoriaVirtual;
    }

    public int getValorMemoriaFisica() {
        return valorMemoriaFisica;
    }

    public void setValorMemoriaFisica(int valorMemoriaFisica) {
        this.valorMemoriaFisica = valorMemoriaFisica;
    }
    
    

}
