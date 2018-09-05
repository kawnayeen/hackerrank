package datastructure.linkedlist;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/9/18
 */
public class _1_PrintLinkedListTest extends ConsoleOutputTest {
    @Test
    public void testPrint() {
        _1_PrintLinkedList.SinglyLinkedList linkedList = new _1_PrintLinkedList.SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);
        _1_PrintLinkedList printList = new _1_PrintLinkedList();
        printList.printLinkedList(linkedList.head);
        Assert.assertEquals("16\n13\n", outContent.toString());
    }
}