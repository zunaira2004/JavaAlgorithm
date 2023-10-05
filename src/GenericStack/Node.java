package GenericStack;

public class Node <T>{
    Node<T> next;
    T data;
    Node(){}
    Node(T d)
    {
        next=null;
        data=d;
    }
    void setData(T d)
    {
        this.data=d;
    }
    void setNext(Node<T> n)
    {
        this.next=n;
    }
    Node<T> getNext()
    {
        return this.next;
    }
    T getData()
    {
        return this.data;
    }


}
