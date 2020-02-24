package definition;

import adt.singlaLinkedListadt;

public class linkedlist<E> implements singlaLinkedListadt
{
    Node<E> head=null;
    public int size=0;

    private Node<E> getNode(int index) {
        Node<E> response=null;
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        else{
            Node<E> temp=head;
            for(int i=0;i<index && temp!=null ;i++){
                temp=temp.getNext();

            }
            response=temp;
        }

        return response;
    }
    private void addFirst(E item){
        if (size==0){
            head=new Node<E>(item,head);
        }
        size++;
    }
    private void addAfter(Node<E>node,E item){
        node.next=new Node(item,node.getNext());
        size++;
    }
    private E removeFirst() {
        Node<E> temp = head;
        E response = null;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getData();

        }
        return response;
    }
    private E removeAfter(Node<E> afternode) {
        Node<E> temp = afternode.getNext();
        if (temp != null) {
            afternode.next = temp.getNext();
            size--;
        }
        E respone = temp.getData();
        return respone;
    }


    @Override
    public void add(Object item) {

    }

    @Override
    public Object getData(int index) {
        return null;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data,Node next){
            this.data=data;
            this.next=next;
        }

        private Node(E data){
            this.data=data;
        }
        private Node(){}

        public E getData() {
            return data;
        }

        public Node<E> getNext(){
            return next;
        }
    }
}
