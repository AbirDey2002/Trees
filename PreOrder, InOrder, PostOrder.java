class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        data = val;
    }
}

class Main{
    static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    static void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
	
	static void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
		postOrder(node.right);
        System.out.print(node.data+" ");
        
    }
    
    
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.left.right.left = new Node(1);
        preOrder(root);
        System.out.println();
        inOrder(root);
		System.out.println();
        postOrder(root);
        
    }
}
