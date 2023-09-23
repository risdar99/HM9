package HM9Number2;

public class MyLinkedList<T> {
        private Node <T> head;
        private Node <T> tail;
      private int size;

    public MyLinkedList() {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public void add(T value){
      Node<T> node = new Node<> (value);

      if(head == null){
          head = node;
          tail = node;
      } else{
          tail.next = node;
          node.previous = tail;
          tail = node;
      }
      size ++;
  }
  public int size(){

        return size;
  }
  public void clear(){
      head = null;
     tail = null;
      size = 0;

  }
  public T get(int index){
      if (index < 0 || index >= size)
          throw new IndexOutOfBoundsException("Invalid index");

      Node<T> current = head;
      for(int i =0; i < index; i++){
          current=current.next;
      }
      return current.value;
  }
  public void remove(int index){
      if (index < 0 || index >= size)
          throw new IndexOutOfBoundsException("Invalid index");
      Node<T> current = head;
      for(int i = 0; i < index; i++){
          current = current.next;
      }
      if(current.previous != null){
          current.previous.next = current.next;

      } else{
          head = current.next;
      }
      if(current.previous != null){
          current.next.previous =current.previous ;

      } else{
          tail = current.previous ;
      }
        size --;
  }




    static class Node<T>{
        T value;
        Node <T> next;
        Node <T> previous;

        public Node(T value) {

            this.value = value;
        }
    }

}
