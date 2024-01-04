//standard Algonquin header here
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/*
Student Name: tai nguyen    
Student Number:041086103
Course & Section #: 22S_CST8288_031
Declaration: class convert Fahrenheit to Celsius
This is my own original work and is free from Plagiarism.
*/
/**
 * 
 * @author tai nguyen
 * test class with main method
 */
public class UnitConverterTest {

    /**
     * main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        UnitConverter unitC = new UnitConverter();
            
            System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, unitC.executeStrategy(70.0));
               
            unitC.setStrategy(new CFconverter());
            System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 0.0, unitC.executeStrategy(0.0));
                
            unitC.setStrategy(new KPconverter());
            System.out.printf("%5.2f in Kilograms is %5.2f Pounds\n", 70.5, unitC.executeStrategy(70.5));

            unitC.setStrategy(new PKconverter());
            System.out.printf("%5.2f in Pounds is %5.2f Kilograms\n", 195.7, unitC.executeStrategy(195.7));


	}

}
