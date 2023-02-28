package org.example;

class Addition extends Operation implements Icalculator
{
    public int calc(int value,int result)
    {
        return result+value;
    }
}
