public class linkedlist {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public Node head;
    public Node tail;

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
      Node  temp=head;
      while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
      }


    }

  public void arrayToLinkedList(int [] array){
    for (int i = 0; i < array.length; i++) {
        Node newNode=new Node(array[i]);
        if (head==null) {
            head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }
  }

  public void delete(int data){
    if (head==null) {
        System.out.println("empty");
    }
    Node temp=head,prev=null;
    while (temp!=null && temp.data!=data) {
        prev=temp;
        temp=temp.next;
    }
    if (temp==null) {
        System.out.println("no data found");
        return;
    }
    if (temp==head) {
        head=head.next;
        return;
    }
    if (tail==temp) {
        tail=prev;
        tail.next=null;
        return;
    }
    prev.next=temp.next;
  }

  public void insert(int number,int data){
    Node newNode=new Node(data);
    if (head==null) {
        return;
    }
    Node temp=head,after=null;
    while (temp!=null && temp.data!=number) {
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


  public void insertbefore(int number,int data){
    Node newNode=new Node(data);
    if (head==null) {
        return;
    }
    Node temp=head,prev=null;
    while (temp!=null && temp.data!=number) {
        prev=temp;
        temp=temp.next;
    }
    if (head.data == number) {
        newNode.next = head;
        head = newNode;
        return;
    }
   prev.next=newNode;
   newNode.next=temp;

  }



    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        int [] array ={1,3,5,6};

       list.arrayToLinkedList(array);
       list.insertbefore(1, 4);
        list.display();


    }
}
