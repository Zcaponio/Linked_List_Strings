/**
 * Created by Zack on 2017-09-04.
 */
public class Main {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        list.addNodeToStart("one");
        list.addNodeToStart("two");
        list.addNodeToStart("three");
        list.addNodeToEnd("four");
        list.displayList();
    }
}