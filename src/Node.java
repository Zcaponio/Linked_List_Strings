/**
 * Created by Zack on 2017-09-04.
 */
public class Node {
    private String data;
    private Node link;

    public Node()
    {
        link = null;
        data = null;
    }


    public Node(String newData, Node newLink) {
        data = newData;
        link = newLink;
    }
    public String getData() {
        return data;
    }

    public void setData(String newData) {
        data = newData;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node newLink) {
        link = newLink;
    }

}