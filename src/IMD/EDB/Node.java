package IMD.EDB;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> children;
    private Node parent = null;
    private static int treeDegree;

    public Node(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public Node getParent() {
        return parent;
    }

    public Node addChild(String s) {
        Node node = new Node(s);
        return addChild(node);
    }

    public Node addChild(Node node) {
        treeDegree = 0;
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

    public int getTreeDegree() {
        if(parent != null && treeDegree == 0){
            parent.getTreeDegree();
        } else {
            if(treeDegree < children.size()) {
                treeDegree = children.size();
            }
            for(Node child: children) {
                child.getTreeDegree();
            }
        }
        return treeDegree;
    }

    public boolean isSibling(Node other) {
        if(other == null || other == this) {
            return false;
        }
        return parent == other.parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
