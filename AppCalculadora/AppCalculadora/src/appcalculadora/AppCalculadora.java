/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora;

/**
 *
 * @author Torrecillas
 */
public class AppCalculadora {

    /**
     * @param args the command line arguments
     */
        
       private int num1;
    private int num2;
    public AppCalculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }
    public int suma() {
        int result = num1 + num2;
        return result;
    }
    public int resta() {
        int result;
        if(resta2())
            result = num1 - num2;
        else
            result = num2 - num1;
        return result;
    }
    
    public int multiplica() {
        int result = num1 * num2;
        return result;
    }
    public int divide() {
        try{
        int result = num1 / num2;
        return result;
        }catch(ArithmeticException e){
        return 0;
        }
    }
    
    /*
    public int divide0(){
        if(num2 == 0)
	throw new java.lang.ArithmeticException(“División por cero”);
        else{
	int result = num1  / num2;
	return result;
        }
    */
    
    /*
    public int resta(){
    int result;
    if (resta2())
        result = num1 - num2;
    else
        result = num2 - num1;

    return result;  
}
*/
public boolean resta2(){
    if (num1 >= num2) 
        return true;
    else
        return false;
}
public Integer divide2(){
    if(num2 == 0) return null;
    int result = num1 / num2;

    return result; 
}

/*
public int divide0() {
        if(num2 == 0)
	throw new java.lang.ArithmeticException(“División por cero”);
        else{
	int result = num1  / num2;
	return result;
        }
}
*/


    }
