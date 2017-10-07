/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codebreaker;

/**
 *
 * @author frank.castrillon
 */
public class CodeBreaker {

    private String code;
     
    public CodeBreaker(String code){
        this.code = code;
    }
    
    public String verifyNumber(String numberStr) throws NumberFormatException, CodeBreakerException{
        String res = "";
        String digitNumber;
        String digitCode;
        Integer number = Integer.valueOf(numberStr);
        char firstDigit = numberStr.charAt(0);
        int maxValue = 1000;
        if(number < maxValue && firstDigit!= '0' ) {
            throw new CodeBreakerException();
        }
            
        for (int i = 0; i < numberStr.length(); i++) {
            //Convertir de char a string
            digitNumber = Character.toString(numberStr.charAt(i));
            digitCode = Character.toString(this.code.charAt(i));
            if(this.code.contains(digitNumber))
            {
                if((digitCode).equals(digitNumber)) {
                    res= "X".concat(res);
                } else {
                    res = res.concat("-");
                }
            }
        }        
        return res;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
