package code.ml.functions;

import java.util.List;

import code.ml.functions.IRegressionFunctions;

public class LinearRegression implements IRegressionFunctions
{
	@Override
	public float Func(List<Float> theta, 
					  List<Float> trainingPoints)
	{
		float funcResult = 0.0f;
		int m = theta.size();
		for(int i=0;i<m;++i)
		{
			funcResult += ( theta.get(i) * trainingPoints.get(i) );
		}
		return funcResult;
	}

	@Override
	public float gradient(List<Float> theta,
						  List<List<Float>> trainingExamples,
						  List<Float> labels)
	{
		/* trainingPoints is a list of training examples.
		 * each training example is an n-dimensional vector.
		 * */
		float sum = 0.0f;
		for(int i=0;i<trainingExamples.size();++i)
		{
			assert(theta.size() == trainingExamples.get(i).size()):"Number of Parameters and Training examples do not match";
			for(int j=0;j<trainingExamples.get(i).size();++j)
			{
				sum += (this.Func( theta, trainingExamples.get(i) ) - labels.get(i) ) * trainingExamples.get(i).get(j);
			}
		}
		int m = theta.size();
		return (float)  sum/m;
	}
}
