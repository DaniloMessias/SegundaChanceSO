/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memoriavirtual;

import disco.MemoriaHD;
import java.util.ArrayList;

/**
 *
 * @author Raquel Calado
 */
public class MemoriaVirtual {

    //Lista de Páginas Virtuais
    private ArrayList<PaginaVirtual> paginasVirtuais = new ArrayList<PaginaVirtual>();
    //Lista de Molduras de Página
    private ArrayList<MolduraDePagina> moldurasDePaginas = new ArrayList<MolduraDePagina>();
    //Lista dos dados do programa no HD
    private ArrayList<MemoriaHD> hd_dados_programa = new ArrayList<MemoriaHD>();
    //Indice da thread que estará escrevendo/lendo
    private int indiceThread;

    public ArrayList<PaginaVirtual> getPaginasVirtuais() {
        return paginasVirtuais;
    }

    public ArrayList<MolduraDePagina> getMoldurasDePaginas() {
        return moldurasDePaginas;
    }

    public ArrayList<MemoriaHD> getHd_dados_programa() {
        return hd_dados_programa;
    }

    public int getIndiceThread() {
        return indiceThread;
    }

    public MemoriaVirtual(ArrayList<PaginaVirtual> paginasVirtuais, ArrayList<MolduraDePagina> moldurasDePaginas, ArrayList<MemoriaHD> hd_dados_programa, int indiceThread) {

        this.moldurasDePaginas = moldurasDePaginas;
        this.paginasVirtuais = paginasVirtuais;
        this.hd_dados_programa = hd_dados_programa;
        this.indiceThread = indiceThread;
    }

}