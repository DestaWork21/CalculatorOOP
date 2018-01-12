import java.io.Serializable;



public class Calculator implements java.io.Serializable,CalculatorInterface{

    private static final long serialVersionUID = 1L;

    private double operandOne;

    private double operandTwo;

    private char   oper;

    private double res;

    private static char[] mathOps = {'+','-','*','/','%'};



    public Calculator(){}



    private boolean isMathOp(String op){

        for(int i=0;i<mathOps.length;i++){

            if(op.charAt(0) == mathOps[i]){

                return true;

            }

        }

        return false;

    }



    public void setOperandOne(String op){

        operandOne = Double.parseDouble(op);

    }



    public void setOperandTwo(String op){

        operandTwo = Double.parseDouble(op);

    }



    public void setOperation(String op){

        if(!isMathOp(op)){System.out.println("Invalid Operation."); return;}

        if(op.length() > 1){System.out.println("Invalid Operation."); return;}

        oper = op.charAt(0);

    }



    public void performOperation(){

        switch(oper){

            case '+':

                res = operandOne+operandTwo;

                break;

            case '-':

                res = operandOne-operandTwo;

                break;

            case '*':

                res = operandOne*operandTwo;

                break;

            case '/':

                res = operandOne/operandTwo;

                break;

            case '%':

                res = operandOne%operandTwo;

                break;

            default:

                res = 0;

                break;
        }
    }

    public double getResults(){

        System.out.println(operandOne+" "+oper+" "+operandTwo+" = "+res);

        return res;
    }
}