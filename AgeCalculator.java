
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//1-get values
//2- Calculate year - year of birth
//3 - if age is greater or equal than 16
//  then print "user can drive"
//4-if age is smaller than 16
//  then print "user can't drive and needs to wait x amount of years"
public class AgeCalculator{
private int currentYear = 2025;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getAge (int birthYear )
    {
        int age = currentYear - birthYear;
            if (age >= 16){ 
            System.out.println("User can drive");
            
        
    }
    else {
        int yearsLeft = 16 - age;
        System.out.println("User can't drive");
    }
}
}
