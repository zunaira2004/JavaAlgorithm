package FirstNonrepeatingStream;

import java.util.Scanner;

public class main {
    public static void main(String[]args)
    {
        FirstNonrepeatingStream obj=new FirstNonrepeatingStream();
        System.out.println("Enter the input");
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        for(int i=0;i<input.length();i++)
        {
            obj.add(input.charAt(i));
        }
        System.out.println(obj.getFirstNonRepeatingValue());
    }
}
