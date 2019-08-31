package IMD.EDB;

public class Main {

    public static void main(String[] args) {
	    Node root = new Node("Raiz");
	    Node child1 = root.addChild(new Node("Filho 1"));

	    root.addChild(new Node("Filho 2"));

	    child1.addChild("Neto 1");
	    child1.getTreeDegree();
    }
}
