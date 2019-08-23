package IMD.EDB.Test;

import IMD.EDB.Node;
import org.junit.Before;

import static org.junit.Assert.*;

public class NodeTest {
    private Node test, child1, child2, child3, grnChild1, grnChild2;

    @Before
    public void setUp() throws Exception {
        test = new Node("Raiz");
        child1 = test.addChild(new Node("Child 1"));
        child2 = test.addChild(new Node("Child 2"));
        child3 = test.addChild(new Node("Child 3"));
        grnChild1 = child1.addChild(new Node("GrandChild 1"));
        grnChild2 = child2.addChild(new Node("GrandChild 2"));

    }

    @org.junit.Test
    public void isLeaf() {
        //Arrange;
        boolean boChild1, boChild2, boChild3, boGrnChild1, boGrnChild2;

        //Act
        boChild1 = child1.isLeaf();
        boChild2 = child2.isLeaf();
        boChild3 = child3.isLeaf();
        boGrnChild1 = grnChild1.isLeaf();
        boGrnChild2 = grnChild2.isLeaf();


        //Assert
        assertFalse(boChild1);
        assertFalse(boChild2);
        assertTrue(boChild3);
        assertTrue(boGrnChild1);
        assertTrue(boGrnChild2);
    }

    @org.junit.Test
    public void nodeDegree() {
        //Arrange
    }

    @org.junit.Test
    public void treeDegree() {
    }

    @org.junit.Test
    public void isSibling() {
    }
}