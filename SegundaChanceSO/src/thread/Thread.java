/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

import java.util.ArrayList;
import memoriavirtual.MemoriaVirtual;

/**
 *
 * @author Raquel Calado
 */
public class Thread extends java.lang.Thread {

    //Instruções R e W que serão passadas para as Threads
    private ArrayList<String> instrucoes = new ArrayList<String>();
    //Variavel da memoria virtual, onde tem todas as informações
    //que serão necessárias na hora de saber onde está escrevendo ou lendo
    //(PgVirtual, MolduraPag e dados do programa no hd)
    private MemoriaVirtual  memoriaVirtual;
    //Pra facilitar, a memória será dividida pelas 2 threads, uma parte (o INICIO) pega do começo ao meio
    //e outra (O FIM) do meio ao fim da memória. 
    private int inicio, fim;
    
    public Thread( ArrayList<String> instrucoes , MemoriaVirtual memoriaVirtual,int inicio, int fim ) {
        
        this.instrucoes= instrucoes;
        this.memoriaVirtual = new MemoriaVirtual(memoriaVirtual.getPaginasVirtuais(),
                                                 memoriaVirtual.getMoldurasDePaginas(),
                                                 memoriaVirtual.getHd_dados_programa(), 
                                                 memoriaVirtual.getIndiceThread());
        
        
        
        //Aqui irá exibir qual o início e fim da paginação. Já q vai ser dividido em 2.
        this.inicio= inicio;
        System.out.println("Inicio "+ this.inicio);
        this.fim = fim;
        System.out.println("Fim "+ this.fim );
        
    }
    
        public synchronized void run() {

       //Fazer isso quantas vezes houver instruções de r ou w (ou seja, não para)
            for(int i=0; i<this.instrucoes.size(); i++){

                try {
                    //Colocar um tempinho de parada pra visualizar melhor a execução
                    java.lang.Thread.sleep(2000);
                } catch (Exception e) {
                }
    
            }
    }
}
