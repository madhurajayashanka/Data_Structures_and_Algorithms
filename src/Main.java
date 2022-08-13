import BinarySearchTree.BinarySearchTree;
import Hashtable.HashTable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.set("king",2);
        table.set("donkey",43);
        table.set("shrek",37);
        table.set("elza",21);
        table.printTable();
        System.out.println(table.keys());
         System.out.println("---------------");


    }
}
