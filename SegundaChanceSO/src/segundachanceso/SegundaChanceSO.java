/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package segundachanceso;

import disco.MemoriaHD;
import java.util.ArrayList;
import memoriavirtual.PaginaVirtual;
//tentando dar comit
/**
 *
 * @author Raquel Calado
 */
public class SegundaChanceSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Listas de Páginas Virtuais para q se passe todos os seus atributos.
        ArrayList<PaginaVirtual> paginasvirtuais = new ArrayList<PaginaVirtual>();
        //Listas de molduras de paginas da pagina virtual
        ArrayList<MolduraDePagina> moldurasdepaginas = new ArrayList<MolduraDePagina>();
        //Lista de dados do programa em paginação
        ArrayList<MemoriaHD> dadosprograma = new ArrayList<MemoriaHD>();
        
        //Tamanho da RAM
        int tamanhoMemoriaFisica = 4;
        //Tamanho da memória virtual (2*RAM)
        int tamanhoMemoriaVirtual = 8;
        //Tamanho do arquivo de paginação (arquivoPaginacao=tamanhoMemoriaVirtual)
        int arquivoPaginacao = 8;
        
        

    }

}
