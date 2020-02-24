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
