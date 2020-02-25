package com.company;

import java.util.List;

interface ICompositeNode extends INode {
    List<INode> getNodes();
}
