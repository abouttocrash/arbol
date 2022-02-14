package com.arbol;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    // @BeforeClass
    // public void setup(){
    //     tree = new BinarySearchWillow();
    // }

    
    @Test
    public void treeShouldContainNumber(){
        BinarySearchWillow tree = new BinarySearchWillow();
        tree.add(5);
        assertTrue( tree.containsNumber(5) );
    }
    @Test
    public void treeNotDuplicates(){
        BinarySearchWillow tree = new BinarySearchWillow();
        tree.add(5);
        tree.add(5);
        assertTrue( tree.size == 1);
    }
}
