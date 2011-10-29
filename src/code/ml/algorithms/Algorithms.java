package code.ml.algorithms;

import java.util.ArrayList;
import java.util.List;

import code.ml.functions.IRegressionFunctions;


public class Algorithms
{
	/*
	 * This algorithm finds the local minimum by taking steps proportional to 
	 * the negative of the gradient of the function at the current point.
	 * It assumes that the function is defined and differentiable in the 
	 * neighborhood of the point you are at now.
	 * 
	 * The objective is to minimize the cost function defined by:
	 * 	J(theta) = (1/2m) · (Htheta(x) - y)^2
	 * */
	public static void gradientDescent(List<Float> theta, 
									   final List<List<Float>> trainingPoints, 
									   final List<Float> labels,
									   float learningRate,
									   final int numIterations,
									   final IRegressionFunctions function)
	{
		//Do incremental update.
		List<Float> updates = new ArrayList<Float>();
		for(int iteration = 0; iteration < numIterations; ++iteration)
		{
			for(int i=0;i<theta.size();++i)
			{
				updates.add(i, theta.get(i) - learningRate * function.gradient(theta, trainingPoints, labels));
			}
			theta.clear();
			theta.addAll(updates);
			updates.clear();
		}
	}
}
