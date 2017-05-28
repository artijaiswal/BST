package bst;

public class Bst {
	private Node root;

	public Bst() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void insert(int k) {
		Node n = new Node(k);
		if (root == null)
			root = n;
		else {
			Node parentNode = root;
			Node insNode = root;
			while (insNode != null) {
				parentNode = insNode;
				if (k <= insNode.getKey())
					insNode = insNode.getLeft();
				else
					insNode = insNode.getRight();
			}
			if (k < parentNode.getKey()) {
				parentNode.setLeft(n);

			}

			else
				parentNode.setRight(n);
		}
	}

	public void printInorder(Node n) {
		if (n != null) {
			printInorder(n.getLeft());
			n.print();
			printInorder(n.getRight());
		}
	}

public void printPreorder(Node n)
{
	if(n!=null)
	{
		n.print();
		printPreorder(n.getLeft());
		printPreorder(n.getRight());
	}
}
public void printPostorder(Node n)
{
	if(n!=null)
	{
		
		printPreorder(n.getLeft());
		printPreorder(n.getRight());
		n.print();
	}
}
}
