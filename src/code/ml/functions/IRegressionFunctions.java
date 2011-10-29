package code.ml.functions;

import java.util.List;

public interface IRegressionFunctions 
{
	float Func(List<Float> theta,List<Float> trainingPoint);
	float gradient(List<Float> theta, List<List<Float>> trainingPoints, List<Float> labels);
}
