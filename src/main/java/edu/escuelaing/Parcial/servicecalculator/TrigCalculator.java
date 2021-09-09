package edu.escuelaing.parcial.servicecalculator;

public class TrigCalculator {
    
    public static String getResult(String function,String number){
        System.out.println(function);
        System.out.println(number);
        String res= null;
        if(function.equals("cos")){
            res= '{'+"\"result\":"+Math.cos(Double.parseDouble(number))+'}';
        }else if(function.equals("sin")){
            res= '{'+"\"result\":"+Math.sin(Double.parseDouble(number))+'}';
        }else{
            res= '{'+"\"result\":"+Math.tan(Double.parseDouble(number))+'}';
        }
        return res;
    }
}
