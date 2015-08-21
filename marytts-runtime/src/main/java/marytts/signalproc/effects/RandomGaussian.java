package marytts.signalproc.effects;

import java.util.Random;

/** 
Generate pseudo-random floating point values, with an 
approximately Gaussian (normal) distribution. Mathieu Dominguez July 2015

Many physical measurements have an approximately Gaussian 
distribution; this provides a way of simulating such values. 
*/
public final class RandomGaussian
{   
	//Variables 
	private Random fRandom = new Random();
	 
	 //Getters
	 public double getGaussian(double aMean, double aVariance)
	 {
	   return aMean + fRandom.nextGaussian() * aVariance;
	 }
	
	 //Setters
	 
	 
	 //Method
	 public RandomGaussian()
	 {
		System.out.println("RandomGaussian Creation"); 
	 }
	 
	 private static void log(Object aMsg)
	 {
	   System.out.println(String.valueOf(aMsg));
	 }
	 
	 
	 /***** TO DELETE *******/
	 public static void main(String... aArgs)
	 {
	   RandomGaussian gaussian = new RandomGaussian();
	   double MEAN = 100.0f; 
	   double VARIANCE = 15f;
	   for (int idx = 1; idx <= 20; ++idx){
	     log("Generated : " + gaussian.getGaussian(MEAN, VARIANCE));
	   }
	 }
} 