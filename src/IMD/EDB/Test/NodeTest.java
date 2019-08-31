package IMD.EDB.Test;

import IMD.EDB.Node;
import org.junit.Before;

import static org.junit.Assert.*;

public class NodeTest {
    private Node root, child1, child2, child3, grnChild1, grnChild2;

    @Before
    public void setUp() {
        root = new Node("Raiz");
        child1 = root.addChild(new Node("Child 1"));
        child2 = root.addChild(new Node("Child 2"));
        child3 = root.addChild(new Node("Child 3"));
        grnChild1 = child1.addChild(new Node("GrandChild 1"));
        grnChild2 = child2.addChild(new Node("GrandChild 2"));
    }

    @org.junit.Test
    public void ifIsLeaf() {
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
    public void howManyNodeDegree() {
        //Arrange
        int rootDegree, child1Degree, child2Degree, child3Degree, grnChild1Degree, grnChild2Degree;

        //Act
        rootDegree = root.nodeDegree();
        child1Degree = child1.nodeDegree();
        child2Degree = child2.nodeDegree();
        child3Degree = child3.nodeDegree();
        grnChild1Degree = grnChild1.nodeDegree();
        grnChild2Degree = grnChild2.nodeDegree();

        //Assert
        assertEquals(3, rootDegree);
        assertEquals(1, child1Degree);
        assertEquals(1, child2Degree);
        assertEquals(0, child3Degree);
        assertEquals(0, grnChild1Degree);
        assertEquals(0, grnChild2Degree);
    }

    @org.junit.Test
    public void checkTreeDegree() {
        //Arrange
        int child1TreeDegree, rootTreeDegree, grnChild1TreeDegree;

        //Act
        child1TreeDegree = child1.getTreeDegree();
        rootTreeDegree = root.getTreeDegree();
        grnChild1TreeDegree = grnChild1.getTreeDegree();

        //Assert
        assertEquals(3, child1TreeDegree);
        assertEquals(3, rootTreeDegree);
        assertEquals(3, grnChild1TreeDegree);
    }

    @org.junit.Test
    public void ifIsSibling() {
        //Arrange;
        boolean boChild1, boChild2, boChild3, boGrnChild1, boGrnChild2;

        //Act
        boChild1 = child1.isSibling(child2);
        boChild2 = child2.isSibling(child3);
        boChild3 = child3.isSibling(child3);
        boGrnChild1 = grnChild1.isSibling(root);
        boGrnChild2 = grnChild2.isSibling(child2);

        //Assert
        assertTrue(boChild1);
        assertTrue(boChild2);
        assertFalse(boChild3);
        assertFalse(boGrnChild1);
        assertFalse(boGrnChild2);
    }
}