package angelov.zarko;

import java.util.ArrayList;
import java.util.Random;

public class Secret_Santa {
    static ArrayList<String> list = new ArrayList<>();

    static Random random = new Random();

    public static void AddToArray(String name)
    {
        list.add(name);
    }

    public static void PrintArray()
    {
        System.out.println(list);
    }

    public static String Draw()
    {
        int randomInt = random.nextInt(list.size());
        return list.get(randomInt);
    }
}
