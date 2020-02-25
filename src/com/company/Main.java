package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Node n1 = new Node("A", "A");
        Node n2 = new Node("B", "A");
        Node n3 = new Node("3", "3");
        Node n4 = new Node("D", "D");
        Node n5 = new Node("E", "E");

        List<INode> nodes = new ArrayList<>(Arrays.asList(n1,n2));
        CompositeNode c1 = new CompositeNode("CA","A",nodes);

        List<INode> nodes2 = new ArrayList<>(Arrays.asList(n4,n5));
        CompositeNode c2 = new CompositeNode("CA","CA",nodes2);
        CompositeNode c3 = new CompositeNode("C3","C3",new ArrayList<INode>(Arrays.asList(c1,c2)));

        MyStructure myStructure = new MyStructure(new ArrayList<INode>(Arrays.asList(c3,n3)));
        System.out.println(myStructure.count());
        System.out.println(myStructure.findByRenderer("H"));
        System.out.println(myStructure.findByCode("A"));


    }
}
