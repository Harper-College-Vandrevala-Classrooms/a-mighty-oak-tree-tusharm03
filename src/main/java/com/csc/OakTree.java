package com.csc;

public class OakTree {

    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        // Retrieve and print child nodes
        Node retrievedLeft = nodeOne.left();
        Node retrievedRight = nodeOne.right();

        System.out.println("Left Node: " + retrievedLeft.getData().getName());
        System.out.println("Right Node: " + retrievedRight.getData().getName());
    }
}
