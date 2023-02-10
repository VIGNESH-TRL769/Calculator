package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
interface Icalculator
{
     void calc(int value);
}
abstract class Operation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    
    int result;
    private int value;

    public void setValue(int value)
    {
        this.value=value;
    }
    public int getValue()
    {
        return value;
    }

   
    public void display()
    {
        String print="Result:"+result; 
        Log.info(print);
    }
}
class Addition extends Operation implements Icalculator
{
    public void calc(int value)
    {
        result=result+value;
    }
}
class Subtraction extends Operation implements Icalculator
{
    public void calc(int value)
    {
        result=result-value;
    }
}
class Division extends Operation implements Icalculator
{
    public void calc(int value)
    {
        result=result/value;
    }
}
class Multiplication extends Operation implements Icalculator
{
    public void calc(int value)
    {
        result=result*value;
    }
}
public class Calculator
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public static void main(String[] args)
    {
        Addition add=new Addition();
        Subtraction sub=new Subtraction();
        Division div=new Division();
        Multiplication mul=new Multiplication();
        Scanner input=new Scanner(System.in);
        Log.info("Enter the Value:");
        add.result = input.nextInt();
        int value=0;
        while(true)
        {
            Log.info("\n1.Addtion(+)\n2.Substration(-)\n3.Multiplication(*)\n4.Division(/)\n5.Result\n6.Exit\nEnter The Choice:\n");
            int key = input.nextInt();
            if(key!=5)
            {
                Log.info("Enter the Value:");
                int val = input.nextInt();
                add.setValue(val);
                value = add.getValue();
            }
            switch (key) {
                case 1 -> add.calc(value);
                case 2 -> sub.calc(value);
                case 3 -> mul.calc(value);
                case 4 -> div.calc(value);
                case 5 -> add.display();
                case 6 ->
                {
                    Log.info("-----Thannk You-----");
                    return;
                }
                default -> Log.info("Please Enter Valid Details");
            }
        }
    }
}
