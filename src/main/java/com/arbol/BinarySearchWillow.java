package com.arbol;
public class BinarySearchWillow {
    Node root;
    int size = 0;
   
    public void add(int number){
        root = addNode(root, number);
    }

     /**
        if the new node's value is lower than the current node's, we go to the left child
        if the new node's value is greater than the current node's, we go to the right child
        when the current node is null, we've reached a leaf node and we can insert the new node in that position
    */
    private Node addNode(Node node,int number){
        if(node == null){
            size += 1;
            return new Node(number);
        }
        if(number < node.value)
            node.left = addNode(node.left, number);
        else
            if(number > node.value)
                node.right = addNode(node.right, number);
        return node;
        
    }

    public boolean containsNumber(int number){
        return contains(root, number);
    }

    private boolean contains(Node node,int number){
        if(node == null)
            return false;
        if(node.value == number)
            return true;
        
        return number < node.value ? contains(node.left, number) : contains(node.right, number);
    }
    

    public void delete(int number){
        root = deleteNode(root, number);
    }
    /**
     * Once we find the node to delete, there are 3 main different cases:
        a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
        a node has exactly one child – in the parent node, we replace this node with its only child.
        a node has two children – this is the most complex case because it requires a tree reorganization
     */
    private Node deleteNode(Node node,int number){
        if(node == null)
            return null;
        if(node.value == number){
            //no children
            if(node.left == null && node.right == null)
                node = null;
            else
                //one children
                if(node.left == null || node.right == null)
                    node = node.left == null ? node.right:node.left;
            size -= 1;
        }
        
        else{
            if(number < node.value)
                node.left = deleteNode(node.left, number);
            else
                if(number > node.value)
                    node.right = deleteNode(node.right, number);
        }
        
        return node;
    }

    public Node inOrder(Node node){
        return null;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value+" Left: "+left.value+" Right: "+right.value;
    }
}

