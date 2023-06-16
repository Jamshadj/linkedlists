/**
 * doublelinkedlist
 */
public class doublelinkedlist {

    class Node{
        int data;
        Node prev;
        Node next;

        Node (int data){
            this.data=data;
        }
    }

    public Node head;
    public Node tail;


    public void addNode(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
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
        }
        Node temp=head,previous=null,after=null;

        while (temp!=null&&temp.data!=data) {
            previous=temp;
            temp=temp.next;
        }
        if (temp==head) {
            head=temp.next;
            return;
        }
        if (temp==tail) {
            tail=previous;
            tail.next=null;
            return;
        }
        if (temp==null) {
            System.out.println("no data find");
            return;
        }
        after=temp.next;
        previous.next=after;
        after.prev=previous;
    }


    public void insertAfterNumber(int number,int data){
        Node newNode=new Node(data);
        if (head==null) {
            System.out.println("empty");
            return;
        }
        Node temp=head,after=null;
        while (temp!=null&&temp.data!=number) {
            temp=temp.next;
        }
        if (temp==tail) {
            tail.next=newNode;
            newNode=tail;
            return;
        }
        after=temp.next;
        temp.next=newNode;
        newNode.next=after;


    }



    public void insertBeforeNumber(int number,int data){
        Node newNode=new Node(data);
        if (head==null) {
            System.out.println("empty");
            return;
        }
        Node temp=head,previous=null;
        while (temp!=null&&temp.data!=number) {
            previous=temp;
            temp=temp.next;
        }
        if (temp==head) {
            newNode.next = head;
        head = newNode;
            return;
        }
        previous.next=newNode;
        newNode.next=temp;

    }


    public static void main(String[] args) {
        doublelinkedlist list=new doublelinkedlist();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        
        list.display();
        System.out.println("jinn");
       list.insertBeforeNumber(1, 7);
        list.display();
    }


}