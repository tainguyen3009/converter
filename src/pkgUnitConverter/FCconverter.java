// standard Algonquin header goes here.
package pkgUnitConverter;
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
 * Strategy class implements of ConvStrategy class and contain the method to convert from Fah to Cel
 */
public class FCconverter implements ConvStrategy {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}


}
