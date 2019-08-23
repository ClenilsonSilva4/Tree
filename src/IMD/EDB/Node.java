package IMD.EDB;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> children;
    private Node parent = null;

    public Node(String name) {
        this.name = name;
        children = new ArrayList<>();
    }


    public Node addChild(String s) {
        Node node = new Node(s);
        return addChild(node);
    }

    public Node addChild(Node node) {
        children.add(node);
        node.parent = this;
        return node;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    public int nodeDegree() {
        return children.size();
    }

    public int treeDegree() {
        //TODO Calcular o grau da árvore
        return 0;
    }

    public boolean isSibling(Node other) {

    }
}