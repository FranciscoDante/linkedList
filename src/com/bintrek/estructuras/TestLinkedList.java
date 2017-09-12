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
        
        list.insert("ele 14");
        list.insert("ele 13");
        list.insert("ele 12");
        list.insert("ele 11");
        list.insert("ele 10");
        list.insert("ele 9");
        list.insert("ele 8");
        list.insert("ele 7");
        list.insert("ele 6");        
        list.insert("ele 5");
        list.insert("ele 4");
        list.insert("ele 3");
        list.insert("ele 2");
        list.insert("ele 1");
        
        System.out.println("Elementos agregados");
        
        int tamanio = list.size;
        
//        for(int i=1; i<=tamanio; i++){
//            System.out.println( "Elemento " + i + ":" + list.get() );
//        }
        
//        list.delete(9);
//        list.delete(1);
                
        tamanio = list.size;
        System.out.println( tamanio );
        
        for(int i=1; i<=tamanio; i++){
            System.out.println( "it: "+ i + " - Elemento eliminado:" + list.delete(i) );
        }
        
        System.out.println("===============================");
         tamanio = list.size;
        System.out.println( tamanio );
         for(int i=1; i<=tamanio; i++){
            System.out.println( "Elemento " + i + ":" + list.get() );
        }
        
    }
}