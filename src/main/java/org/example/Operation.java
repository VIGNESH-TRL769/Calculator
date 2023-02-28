package org.example;

import java.util.logging.Logger;

abstract class Operation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    private int value;
    public void setValue(int value)
    {
        this.value=value;
    }
    public int getValue()
    {
        return value;
    }
    public void display(int result)
    {
        String print="Result:"+result;
        Log.info(print);
    }
}

