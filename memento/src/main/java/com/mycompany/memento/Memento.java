/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.memento;

import padroes.memento3.Zelador;
import padroes.memento3.business.Produto;

/**
 *
 * @author ruanr
 */
public class Memento {

    public static void main(String[] args) {
       Produto p1 = new Produto("Coca cola", 3.20,4.60);
       Zelador.getZelador().adicionarMemento(p1.getMemento());
       p1.setCusto(21.0);
       System.out.println(p1);
       Zelador.getZelador().addMementoRefaz(p1.getMemento());
       p1.restaurar(Zelador.getUltimoEstadoSalvo());
       System.out.println(p1);
       p1.restaurar(Zelador.getUltimoEstadoRefaz());
       System.out.println(p1);
    }
    
}
