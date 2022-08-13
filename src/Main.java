import Doubly_Linked_List.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList(3);
        DLL.getHead();
        DLL.getTail();
        DLL.getLength();
        DLL.append(5);
        DLL.append(7);
        DLL.append(23);
        DLL.printList();
        System.out.println("_________________");
        DLL.remove(1);
        DLL.printList();
    }
}
