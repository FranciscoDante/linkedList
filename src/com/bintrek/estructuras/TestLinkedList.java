/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bintrek.estructuras;

/**
 *
 * @author eldantek
 */
public class TestLinkedList {
    public static void main( String [] arg ){
        LinkedList<String> list = new LinkedList<>();
        
        list.insert("Hola");
        list.insert("lista");
        list.insert("ligada");
        
        System.out.println("Elementos agregados");
        
        int tamanio = list.size;
        
        for(int i=1; i<=tamanio; i++){
            System.out.println( "Elemento " + i + ":" + list.get() );
        }
        
    }
}