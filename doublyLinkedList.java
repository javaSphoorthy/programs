public class doublyLinkedList {
    
    node head;
    node tail;

    doublyLinkedList(){
        head = null;
        tail = null;
    }

    void traverseForward(){
        node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void traverseBackward(){
        node temp = tail;
        while(temp.prev!=null){
            System.out.print(temp.data);
            temp = temp.prev;
        }
    }

    void insertAtBegining(int data){
        node newnode = new node(data);
        if(head==null){
            head = newnode;
        }else{
            node temp = head;
            temp.prev = newnode;
            newnode.next = temp;
            tail = newnode;
        }
    }























































































































}
