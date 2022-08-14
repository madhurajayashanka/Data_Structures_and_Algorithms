import BinarySearchTree.BinarySearchTree;
import Graph.Graph;
import Hashtable.HashTable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
         Graph graph = new Graph();
         graph.addVertex("A");
         graph.addVertex("B");
         graph.addVertex("C");
         graph.addVertex("D");
         graph.addEdge("A","B");
         graph.addEdge("A","C");
         graph.addEdge("C","D");
         graph.printGraph();
         System.out.println("---------------");
         graph.removeVertex("C");
         graph.printGraph();


    }
}
