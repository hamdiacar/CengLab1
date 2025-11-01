public class MyStack {
    Node head;
    Node middle;
    int size;

    MyStack() {
        head = null;
        middle = null;
        size = 0;
    }
    public void push(int data){
        Node NewNode = new Node(data);
        NewNode.next = head;
        if (head != null){
            head.prev = NewNode;
        }
        head = NewNode;
        size++;
        if (size == 1){
            middle = NewNode;
        } else if (size % 2 == 0) {
            middle = middle.prev;
        }

    }
    public int pop() {
        if (size == 0) return -1;
        int item = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        size--;
        if (size % 2 == 0 && middle != null){
            middle = middle.next;
        }
        return item;
    }
    public int deleteMiddle(){
        if (size == 0) {
            System.out.println("Error: Stack is empty!");
            return -1;
        }
        int middleVal = middle.data;
        if (middle.prev != null){
            middle.next.prev = middle.prev;
        }
        if (middle.next != null){
            middle.prev.next = middle.next;
        }
        size--;
        if (size % 2 == 0){
            middle = middle.prev;
        }else {
            middle = middle.next;
        }
        if (size == 0){
            head = null;
            middle = null;
        }
        return middleVal;
    }
}
