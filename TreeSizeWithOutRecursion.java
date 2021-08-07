//Program for Finding Size of a Binary Tree
import java.util.LinkedList;
import java.util.Queue;

public class TreeSizeWithOutRecursion {
	// If we are not using recursion then we need a data structure to store the
	// tree traversal, we will use queue here
	public static int getSize(Node root) {
		if (root != null) {
			int size=0; // size of tree
			Queue<Node> q = new LinkedList<>();
			// add root to the queue
			q.add(root);
			while (!q.isEmpty()) {
				Node x = q.poll();
				//increment the size
				size++;
				//add children to the queue
				if(x.left!=null){
					q.add(x.left);
				}
				if(x.right!=null){
					q.add(x.right);
				}
			}
			return size;
		}
		// if root is null, return 0
		return 0;
	}

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(3);
		root.right = new Node(9);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.right.left = new Node(7);
		root.right.right = new Node(11);


		System.out.println("Tree Size: " + getSize(root));
		
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}