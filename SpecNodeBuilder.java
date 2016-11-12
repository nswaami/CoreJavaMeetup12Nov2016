package com.meetup.3DPrinter.Raw

public class SpecNodeBuilder{

  private SpecNode rootNode;
  private SpecNode currentNode;


  public SpecNodeBuilder(String rootTagName) {
    rootNode = new SpecNode(rootTagName);
  }

  public void addChild(String childTagName) {
      SpecNode parentNode = currentNode;
      currentNode = new SpecNode(childTagName);
      parentNode.add(currentNode);
    }

  public String toXml() {
    return rootNode.toString();
  }




}



}
