

/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//1 - get values
//2 - calculaute (worked hours * hourly wage) - taxes
//3 - print net pay
public class Salary
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getSalary (int workedHours, double wage){
        double taxes = 0.30;
        double grossPay = workedHours * wage;
        double netPay = grossPay - (grossPay * taxes);
        System.out.println(netPay);
    }
    
    }

