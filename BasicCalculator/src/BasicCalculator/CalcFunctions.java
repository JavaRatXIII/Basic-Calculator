package BasicCalculator;
/**
 * @author Tamanna Qureshi
 */
public class CalcFunctions {
    
    private String _textResult;
    private String _firstOperand = "0";
    private String _secondOperand = "0";
    private String _operation = "";
    
    public CalcFunctions (String t){
        _textResult = t;
    }
    
    public String InsertNum(String num)
    {
        if(_textResult.equals("0"))
        {
            _textResult = num;
            return(num);
        }
        
        _textResult = _textResult + num;
        return _textResult;
    }
    
    public String Clear()
    {
        _textResult = "0";
        return _textResult;
    }
    
    public void Calculate(String operation)
    {
        _firstOperand = _textResult;
        _textResult = "0";
        _operation = operation;
    }
    
    public String Equal()
    {
        _secondOperand = _textResult;
        _textResult = "0";
        Double result = 0.0;
        if(_operation.equals("+"))
        {
            result = Double.parseDouble(_firstOperand) + Double.parseDouble(_secondOperand);
        }
        else if(_operation.equals("-"))
        {
            result = Double.parseDouble(_firstOperand) - Double.parseDouble(_secondOperand);
        }
        else if(_operation.equals("/"))
        {
            result = Double.parseDouble(_firstOperand) / Double.parseDouble(_secondOperand);
        }
        else
        {
            result = Double.parseDouble(_firstOperand) * Double.parseDouble(_secondOperand);
        }
        _textResult = result.toString();
        return result.toString();
    }
    
}
