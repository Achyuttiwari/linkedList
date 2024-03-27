package node;

public class NodeOperation {
    public void pushNode(Node[] headRef, int dataValue){
        Node newNode = new Node();
        newNode.data = dataValue;
        newNode.next = headRef[0];
    }
}
