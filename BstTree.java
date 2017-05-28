package bst;

public class BstTree {

	public static void main(String[] args) {
	Bst b=new Bst();
	b.insert(5);
	b.insert(4);
	b.insert(10);
	b.insert(37);
	
	b.insert(21);
	System.out.println("Inorder");
	b.printInorder(b.getRoot());
	System.out.println("Preorder");
	b.printPreorder(b.getRoot());
	System.out.println("Postorder");
	b.printPostorder(b.getRoot());
	}

}
