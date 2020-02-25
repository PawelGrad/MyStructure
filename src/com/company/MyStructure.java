package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class MyStructure implements IMyStructure {

    private List<INode> nodes;

    @Override
    public INode findByCode(String code) {
        if(code ==  null){
            throw new IllegalArgumentException("Code can't be null");
        }
        return findMatchingNode(node -> code.equals(node.getCode()));
    }

    @Override
    public INode findByRenderer(String renderer) {
        if(renderer ==  null){
            throw new IllegalArgumentException("Renderer can't be null");
        }
        return findMatchingNode(node -> renderer.equals(node.getRenderer()));
    }

    @Override
    public int count() {
        return findAllNodes(nodes).size();
    }

    public INode findMatchingNode(Predicate<INode> predicate){

        //Moze istniec kilka wezłów spełniających podany warunek.
        return findAllNodes(nodes).stream()
                .filter(predicate)
                .findAny()
                .orElse(null);
    }

    public List<INode> findAllNodes(List<INode> nodes){

        //Przy założeniu, że każdy node występuje w strukturze dokładnie jeden raz.
        List<INode> newNodes = new ArrayList<>(nodes);
        nodes.stream()
                .filter(node -> node instanceof ICompositeNode)
                .forEach(node -> newNodes.addAll(findAllNodes(((ICompositeNode) node).getNodes())));

        return newNodes;
    }

    public MyStructure(List<INode> nodes) {
        this.nodes = nodes;
    }


}