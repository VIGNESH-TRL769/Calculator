package org.example;

class Division extends Operation implements Icalculator
{
    public int calc(int value,int result)
    {
        try
        {
            return result/value;
        }
        catch (Exception e)
        {
            String p=""+e;
            Log.info(p);
            return result;
        }
    }
}
