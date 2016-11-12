package com.meetup.3DPrinter.Refactored

public class SpecNode{

    private SpecNode parent;

    public void add(SpecNode childNode) {
      childNode.setParent(this);
      children().add(childNode);
    }

    private void setParent(SpecNode parent) {
      this.parent = parent;
    }

    public TagNode getParent() {
      return parent;
    }

}
