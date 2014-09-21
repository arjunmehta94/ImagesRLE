/* A linked list of Run Nodes */

public class RunList {

  /**
   *  head references the first node.
   *  tail references the last node.
   *
   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
   */

  private RunListNode head;
  private RunListNode tail;
  private int size;


  /* RunList invariants:
   *  1)  head.prev == null.
   *  2)  tail.next == null.
   *  3)  For any RunListNode x in a RunList, if x.next == y and x.next != null,
   *      then y.prev == x.
   *  4)  For any RunListNode x in a RunList, if x.prev == y and x.prev != null,
   *      then y.next == x.
   *  5)  The tail can be accessed from the head by a sequence of "next"
   *      references.
   *  6)  size is the number of RunListNodes that can be accessed from the
   *      head by a sequence of "next" references.
   */

  /**
   *  RunList() constructor for an empty RunList.
   */
  public RunList() {
    head = null;
    tail = null;
    size = 0;
  }

  // RunList(Run a) constructor for RunList with 1 node 
  public RunList(int[] a){
    head = new RunListNode();
    tail = head;
    head.item = a;
    size = 1;
  }

  public RunList(int[] a, int[] b){
    head = new RunListNode();
    head.item = a;
    tail = new RunListNode();
    tail.item = b;
    head.next = tail;
    tail.prev = head;
    size = 2;
  }
 
  /**
   *  insertFront() inserts an item at the front of a RunList.
   */
  
  public boolean isEmpty(){
    return size == 0;
  }
  public RunListNode getFirst(){
    return this.head;
  }
  public RunListNode getLast(){
    return this.tail;
  }
  public int getSize(){
    return this.size;
}
  public RunListNode nthnode(int position){
    RunListNode currentNode;
    if(position < 1 || head == null){
      return null;
    }
    else {
      currentNode = head;
      while (position > 1) {
        currentNode = currentNode.next();
        if (currentNode == null) {
          return null;
        }
        position--;
      }
      return currentNode;
    }
  } 

  public int[] nth(int position) {
    RunListNode currentNode;

    if ((position < 1) || (head == null)) {
      return null;
    } else {
      currentNode = head;
      while (position > 1) {
        currentNode = currentNode.next();
        if (currentNode == null) {
          return null;
        }
        position--;
      }
      return currentNode.item;
    }
  } 
  public void insert(int[] i, int position){
    if(head == null && position == 0){
      head = new RunListNode();
      head.item = i;
      tail = head;
    }
    else{
      
    }
  }
  public void insertFront(int[] i) {
   
    if(head == null){
      head = new RunListNode();
      head.item = i;
      tail = head;
      
    }else{
      RunListNode tmp = head;
      head = new RunListNode();
      head.item = i;
      head.next = tmp;
      head.prev = null;
      tmp.prev = head;

    }
    size++;
}

  public void insertEnd(int[] i){
    if(head == null){
      head = new RunListNode();
      head.item = i;
      tail = head;
    }
    else{
      RunListNode tmp = new RunListNode();
      tail.next = tmp;
      tmp.prev = tail;
      tmp.item = i;
      tail = tail.next;
    }
    size++;
  }

  
  /**
   *  removeFront() removes the first item (and node) from a RunList.  If the
   *  list is empty, do nothing.
   */
  public void removeFront() {
    
    if(size == 1){
      head = head.next;
      tail = head;
      size--;
      
    }
    else if(size>1){
      head = head.next;
      head.prev = null;
      size--;
    }

  }

  public void removeEnd(){
    if(size == 1){
      tail = tail.prev;
      head = tail;
      size--;
    }
    else if(size>1){
      tail = tail.prev;
      tail.next = null;
      size--;
    }
  }

  /**
   *  toString() returns a String representation of this RunList.
   *
   *  DO NOT CHANGE THIS METHOD.
   *
   *  @return a String representation of this RunList.
   */
  public String toString() {
    String result = "[  ";
    RunListNode current = head;
    while (current != null) {
      result = result + current.item + "  ";
      current = current.next;
    }
    return result + "]";
  }
}