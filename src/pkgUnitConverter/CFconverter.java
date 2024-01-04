// standard Algonquin header goes here.
package pkgUnitConverter;
/*
Student Name: tai nguyen    
Student Number:041086103
Course & Section #: 22S_CST8288_031
Declaration: class convert Celsius to Fahrenheit
This is my own original work and is free from Plagiarism.
*/
/**
 * 
 * @author tai nguyen
 * Strategy class implement ConvStrategy and contain method to convert from cel to fah
 */
public class CFconverter implements ConvStrategy {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}


}
