package net.finmath.figures;

import net.finmath.stochastic.RandomVariableInterface;

public class MonteCarloAlgebraInterface implements ExposureAlgebraInterface<RandomVariableInterface> {
    @Override
    public RandomVariableInterface netExposures(RandomVariableInterface x, RandomVariableInterface y) {
        return x.add(y);
    }

    @Override
    public RandomVariableInterface experienceExposures(RandomVariableInterface x, RandomVariableInterface y, double timeSpan) {
        return x.add(y).mult(timeSpan / 2.0);
    }
}
