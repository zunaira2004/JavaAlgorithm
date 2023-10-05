package GenericStack;

public class GenericStack<T> {
    Node<T> top;
    int size;
    void push(T d)
    {
        if(top==null)
        {
            Node<T> node=new Node<>(d);
            top=node;
        }
        else
        {
            Node<T> n=new Node<>(d);
            n.setNext(top);
            top=n;
        }
    }
    boolean isEmpty()
    {
        if(top==null)
            return true;
        else
            return false;
    }
    int getSize()
    {
        return size;
    }
    void setSize(int s)
    {
        size=s;
    }

    T pop()
    {
        top=top.next;
        size--;
        if(top==null)
            return null;
        return top.getData();
    }
    void display()
    {
        Node<T> node= new Node<T>();
        node=top;
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }

}
