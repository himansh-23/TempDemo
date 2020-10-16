package org.example.binarytree;

//Rough Work
public class BinaryTree <X extends Comparable<X>>{

    private Node<X> rootNode;

    public BinaryTree(){

    }

    public void add(X value){
        if(rootNode == null){
            rootNode = new Node<X>(value);
            return;
        }
        Node<X> temp = rootNode;
        while(temp!= null){
        if(value.compareTo(temp.value)<0)
        {
            if(temp.left== null){
                temp.left = new Node<X>(value);
                return;
            }
            else{
                temp= temp.left;
            }
        } else{
            if(temp.right == null){
                temp.right = new Node<X>(value);
                return;
            }
            else{
                temp = temp.right;
            }
        }

        }

    }

    public void print(){
        printing(rootNode);
    }

    public void printing(Node<X> node){
        if(node != null) {
            System.out.println(node.value);
            printing(node.left);
            printing(node.right);
        }
    }
}
