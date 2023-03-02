// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        data = val;
    }
}

class Main{
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.left.right.left = new Node(1);
    }
}

