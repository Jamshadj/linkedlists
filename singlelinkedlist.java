/**
 * singlelinkedlist
 */
public class singlelinkedlist {

    class Node{
        int data;
        Node next;
        
            Node(int data){
                this.data=data;
            }
    }

    public Node head=null;
    public Node tail=null;


    public void addnode(int data){
        Node newNode=new Node(data);
        if (head==null) {
             head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void display(){
        if (head==null) {
            System.out.println("empty");
            return;
        }
     Node temp=head;
     while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
     }
    }

    public void delete(int data){
        if (head==null) {
            System.out.println("empty");
            return;
        }

       Node temp=head,prev=null;
       while (temp!=null && temp.data!=data) {
        prev=temp;
        temp=temp.next;
       }
       if (temp==null) {
        System.out.println("enter data is not int this list");
        return;
       }
       if (temp.data==head.data) {
        head=temp.next;
        return;
       }
       if (temp.data==tail.data) {
        tail=prev;
        return;
       }
       prev.next=temp.next;


    }



    public void insertAfterANumber(int number,int data){
        Node newNode=new Node(data);
        if (head==null) {
            System.out.println("empty");
            return;
        }

       Node temp=head,afterData=null;
        while (temp!=null && temp.data!=number) {
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println("there is number matches");
            return;
        }
        if (temp==tail) {
            tail.next=newNode;
            newNode=tail;
            return;
        }
        afterData=temp.next;
        temp.next=newNode;
        newNode.next=afterData;
    }

    public void insertBeforerANumber(int number,int data){
        Node newNode=new Node(data);
        if (head==null) {
            System.out.println("empty");
            return;
        }

       Node temp=head,prev=null;
        while (temp!=null && temp.data!=number) {
            prev=temp;
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println("there is number matches");
            return;
        }
        if(temp==head){
            head.next=temp;
            head=newNode;
            return;
        }

        prev.next=newNode;
        newNode.next=temp;


    }


    public void insertHead(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        head=newNode;
        head.next=temp;
    }


    public void inserttail(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
       tail=tail.next;
    }

    public void arrayToLinkedList(int [] array){
        for (int i = 0; i < array.length; i++) {
            Node newNode=new Node(array[i]);
            if (head==null) {
                head=newNode;
            } else {
                tail.next=newNode;
            }
            tail=newNode;
        }
    }




    public void displayReverse(){
    if (head==null) {
        System.out.println("empty");
    }
    Node current=head,next=null,previous=null;
    while (current!=null) {
        next=current.next;
        current.next=previous;
        previous=current;
        current=next;
    }
    head=previous;
    }



    public void removeDuplicate(){
        if(head == null) return;
        
        Node current = head;
        while (current != null) {
            Node next = current.next;
            while (next != null && current.data == next.data) {
                current.next = next.next;
                next = next.next;
            }
            current = current.next;
        }
    }
    




    public static void main(String[] args) {
        singlelinkedlist list = new singlelinkedlist();
        list.addnode(3);
        list.addnode(4);
        list.addnode(4);
        list.addnode(4);
        list.addnode(5);
        list.addnode(6);
        list.addnode(6);
        list.addnode(6);
        list.addnode(7);
        
       list.insertBeforerANumber(3, 2);;
       
        list.display();
    }
        
}
    

