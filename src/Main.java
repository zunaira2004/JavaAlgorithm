import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size=0;
        GenericStack<Integer> o=new GenericStack<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of your stack");
        size=s.nextInt();
        o.setSize(size);
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter Stack value "+(i+1)+":");
            int data=s.nextInt();
            o.push(data);
        }
        int choice=0;
        while(true)
        {
            System.out.println("Enter you choice\n1 to push\n2 to pop\n3 to check if empty\n4 to to check size\n5 to print\n6 to exit");
            choice=s.nextInt();

            if(choice==1)
            {
                try
                {
                    if(o.getSize()+1>size)
                    {
                        throw new StackOverflowError();
                    }
                    else
                    {
                        System.out.println("Enter your value");
                        int data=s.nextInt();
                        o.push(data);
                    }
                }
                catch(StackOverflowError e)
                {
                    e.printStackTrace();
                }

            }
            else if(choice==2)
            {
                try
                {
                    if(o.isEmpty())
                        throw new StackOverflowError();
                    else
                    {
                        System.out.println("The top of stack is: "+o.pop());
                    }
                }
                catch (StackOverflowError e)
                {
                    e.printStackTrace();
                }
            }
            else if(choice==3)
            {
                if(o.isEmpty())
                    System.out.println("The stack is empty");
                else
                    System.out.println("The stack is not empty");
            }
            else if(choice==4)
            {
                System.out.println("The size of stack is: "+o.getSize());
            }
            else if(choice==5)
            {
                o.display();
            }
            else
                break;
        }
    }
}