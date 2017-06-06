package BasicCalculator;
/**
 * @author Tamanna Qureshi
 */
public class CalcFunctions {
    
    String text;
    String n1 = "0";
    String n2 = "0";
    String operation = "";
    
    public CalcFunctions (String t){
        text = t;
    }
    
    public String insertNum(String num)
    {
        if(text.equals("0"))
        {
            text = num;
            return(num);
        }
        text = text + num;
        return text;
    }
    
    public String clear()
    {
        text = "0";
        return text;
    }
    
    public void calcu(String oper)
    {
        n1 = text;
        text = "0";
        operation = oper;
    }
    
    public String Equal()
    {
        String res = "";
        n2 = text;
        text = "0";
        Double result = 0.0;
        if(operation.equals("+"))
        {
            result = Double.parseDouble(n1) + Double.parseDouble(n2);
            res = ""+result;
        }
        else if(operation.equals("-"))
        {
            result = Double.parseDouble(n1) - Double.parseDouble(n2);
            res = ""+result;
        }
        else if(operation.equals("/"))
        {
            result = Double.parseDouble(n1) / Double.parseDouble(n2);
            res = ""+result;
        }
        else
        {
            result = Double.parseDouble(n1) * Double.parseDouble(n2);
            res = ""+result;
        }
        text = res;
        return res;
    }
    
}
