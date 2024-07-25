package components;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head =null;
    }

    public void append(int data){
        Node newNode = new Node(data);

        if(head==null){//if ll is empty
            head =newNode;
            return;
        }
        //intializing temp node variable to point head
        Node n = head;
        //traverse linklist to find the last node
        while(n.next!=null){
            n=n.next;//sift n to point next node
        }
        n.next = newNode;
    }
    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.next = head;//current head goes to new node's next
        head = newNode; //head is newNode 
    }
    public void insertAt(int index, int data){
        Node newNode = new Node(data);
        if(index==0){//inser data at oth index
            newNode.next = head;
            head = newNode;
            return;
        }
        Node node = head;
       for(int i=0;i<index-1;i++){//iterate till before the desired index
            if(node == null){
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            node= node.next;
       }
        newNode.next = node.next;//node at desired index goes to next index
        node.next = newNode;//new node is inserted at desired index 
    }
    public void deleteAt(int index){
        if(index==0){
            if(head == null){
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            head = head.next;
            return;
        }
        Node currentNode = head;
        Node prevNode = null;
        for(int i=0; i<index;i++){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = currentNode.next;
    }
    public void printLinkedList(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
}
