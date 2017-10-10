/**
 * Created by Zack on 2017-09-03.
 */
import java.util.ArrayList;
import java.util.*;

public class StringLinkedList {

    private Node head;
    private Node tail;

    public StringLinkedList() {
        head = null;
        tail = null;
    }

    public void displayList() {
        Node position = head;
        while (position != null) {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }

    public int length() {
        int count = 0;
        Node position = head;
        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public void addNodeToStart(String addData) {
        head = new Node(addData, head);
    }

    public void addNodeToEnd(String addData) {
        tail = new Node(addData, tail);
        if (head == null) {
            System.out.println("empty");
        }
        Node current = head;
        while (current.getLink() != null) {
            current = current.getLink();
        }current.setLink(tail);
    }

    public void deleteHeadNode() {
        if (head != null)
            head = head.getLink();
        else {
            System.out.println("Deleting from an empty list.");
            System.exit(0);
        }
    }

    public void deleteTailNode() {
        Node current = head;
        while (current.getLink() != null) {
            current = current.getLink();
        }current.setData(" ");
    }


    public boolean onList(String target) {
        return find(target) != null;
    }

    private Node find(String target) {
        boolean found = false;
        Node position = head;
        while ((position != null) && !found) {
            String dataAtPostion = position.getData();
            if (dataAtPostion.equals(target))
                found = true;
            else
                position = position.getLink();
        }
        return position;
    }
}