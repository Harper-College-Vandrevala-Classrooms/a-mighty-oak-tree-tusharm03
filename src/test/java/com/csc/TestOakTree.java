package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

    OakTree tree;

    @BeforeEach
    void setUp() {
        tree = new OakTree();
    }

    @Test
    void testSquirrelNames() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        // Test if the left and right children are set correctly
        assertEquals("Squeaks", nodeOne.left().getData().getName());
        assertEquals("Mr. Fluffy Butt", nodeOne.right().getData().getName());
    }

    @Test
    void testTreeStructure() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        // Verify the root node's children
        assertEquals("Squeaks", nodeOne.left().getData().getName());
        assertEquals("Mr. Fluffy Butt", nodeOne.right().getData().getName());
    }
}
