package code.ml.operations;

import java.util.List;

public class GeometricOperations 
{
	public static float dot(List<Float> x, List<Float> y)
	{
		assert(x.size() == y.size()) : "Size of vectors don't match";
		float prod = 0.0f;
		for(int i=0;i<x.size();++i)
		{
			prod += (x.get(i) * y.get(i));
		}
		return prod;
	}
}
