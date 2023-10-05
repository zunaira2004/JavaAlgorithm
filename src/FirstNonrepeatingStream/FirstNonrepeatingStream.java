package FirstNonrepeatingStream;
import java.util.HashMap;
public class FirstNonrepeatingStream {
    HashMap<Character, Boolean> hashMap;
    char nonRepeat;

    FirstNonrepeatingStream()
    {
        hashMap=new HashMap<>();
        nonRepeat='-';
    }
    void add(char k)
    {
        if(hashMap.containsKey(k)&& hashMap.containsValue(false))
        {
            hashMap.put(k,true);
            if(nonRepeat==k)
                nonRepeat='-';
        }
        else if(!hashMap.containsKey(k))
        {
            hashMap.put(k,false);
            if(nonRepeat=='-')
                nonRepeat=k;
        }
    }
    char getFirstNonRepeatingValue()
    {
        return nonRepeat;
    }
}
