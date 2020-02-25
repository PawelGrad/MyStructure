package com.company;

public class Node implements INode {

    private String code;
    private String renderer;

    public Node(String code, String renderer) {
        this.code = code;
        this.renderer = renderer;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getRenderer() {
        return renderer;
    }

    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    @Override
    public String toString() {
        return "Node{" +
                "code='" + code + '\'' +
                ", renderer='" + renderer + '\'' +
                '}';
    }
}
