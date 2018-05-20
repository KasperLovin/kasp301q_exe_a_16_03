public class ch_16_03
{
    /*Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
    otherwise. An empty list is considered to be sorted.*/

    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        //list.add(0);
        //list.add(1);
        //list.add(2);
        //list.add(3);

        isSorted(list);
        System.out.println(isSorted(list));

    }
    public static boolean isSorted(LinkedIntList liste)
    {
        boolean sorted = false;
        int container = 0;
        for (int i = 0; i <liste.size() ; i++)
        {
            if (liste.get(i) >= container)
            {
                container = liste.get(i);
                sorted = true;
            }
            else
                {
                    sorted = false;
                    break;
                }
        }
        return sorted;
    }
}
