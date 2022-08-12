import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.append(5);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.printList();
        System.out.println("_________________");
        System.out.println(linkedList.get(56));
    }
}
