import BinarySearchTree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
         BinarySearchTree binarySearchTree = new BinarySearchTree();
            binarySearchTree.insert(47);
            binarySearchTree.insert(21);
            binarySearchTree.insert(56);
            binarySearchTree.insert(76);
            binarySearchTree.insert(18);
            binarySearchTree.insert(52);
            binarySearchTree.insert(82);
            binarySearchTree.insert(84);
         System.out.println("---------------");
        System.out.println(binarySearchTree.contains(18));
    }
}
