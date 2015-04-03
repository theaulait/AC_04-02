package nyc.c4q.theaulait;
/**
 * Created by c4q-vanice on 4/2/15.
 */

import java.util.HashSet;

public class SocialNetwork
{
    public static void main(String[] args)
    {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println(allFriends(yours, mine));
        System.out.println(mutualFriends(yours, mine));
        System.out.println(justYourFriends(yours, mine));
        System.out.println(justMyFriends(yours, mine));
        System.out.println(exclusiveFriends(yours, mine));
        System.out.println(yourFriendsAreMine(yours, mine));
        System.out.println(youHaveFriends(yours));
        System.out.println(matchmaker(yours, mine));
    }

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> all = new HashSet<String>();
        all.addAll(yours);
        all.addAll(mine);
        return all;
    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> mutal = new HashSet<String>();


        for(String name : mine)
        {
            if(yours.contains(name))
            {
                mutal.add(name);
            }
        }

        return mutal;
    }

    public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> justyour = new HashSet<String>();


        justyour.addAll(yours);
        justyour.addAll(mine);

        justyour.removeAll(mine);


        return justyour;
    }

    public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> justmine = new HashSet<String>();


        justmine.addAll(yours);
        justmine.addAll(mine);

        justmine.removeAll(yours);


        return justmine;
    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> exclusive = new HashSet<String>();

        exclusive.addAll(yours);
        exclusive.addAll(mine);

        for(String name : mine)
        {
            if(yours.contains(name))
            {
                exclusive.remove(name);
            }
        }

        return exclusive;
    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine)
    {

        if(yours.equals(mine))
        {
            ;
        }
        return true;
    }

    public static boolean youHaveFriends(HashSet<String> yours)
    {
        if(! yours.isEmpty())
        {
            return true;
        }
        else
            return false;
    }



    public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<HashSet<String>> pairs = new HashSet<HashSet<String>>();

        for(String name : yours)
        {
            for(String name2 : mine)
            {
                HashSet<String> pair = new HashSet<String>();
                pair.add(name);
                pair.add(name2);
                if(pair.size() != 1)
                {
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }
}
