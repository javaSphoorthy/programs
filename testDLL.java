public class testDLL {
    public static void main(String args[]){
        doublyLinkedList dll = new doublyLinkedList();

        dll.insertAtBegining(10);
        dll.traverseForward();
        dll.insertAtBegining(20);
        dll.insertAtBegining(30);
        dll.traverseBackward();
    }
}
