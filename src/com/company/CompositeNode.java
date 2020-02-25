package com.company;

import java.util.List;

public class CompositeNode extends Node implements ICompositeNode {

    public CompositeNode(String code, String renderer, List<INode> nodes) {
        super(code, renderer);
        this.nodes = nodes;
    }

    private List<INode> nodes;

    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        return "CompositeNode{" +
                "nodes=" + nodes +
                '}';
    }
}
