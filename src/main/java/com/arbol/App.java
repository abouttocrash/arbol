package com.arbol;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        BinarySearchWillow sauce = new BinarySearchWillow();
        sauce.add(5);
        sauce.add(4);
        sauce.add(2);
        sauce.add(1);
        sauce.delete(2);
        System.out.println(sauce.containsNumber(2));
    }
}
