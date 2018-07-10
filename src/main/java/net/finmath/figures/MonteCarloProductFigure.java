package net.finmath.figures;

import io.atlassian.fugue.Either;
import net.finmath.exception.CalculationException;
import net.finmath.montecarlo.AbstractMonteCarloProduct;
import net.finmath.montecarlo.MonteCarloSimulationInterface;
import net.finmath.stochastic.RandomVariableInterface;

/**
 * Exposes a Monte Carlo product's value as figure.
 */
public class MonteCarloProductFigure implements FigureInterface<RandomVariableInterface, MonteCarloSimulationInterface> {
    private AbstractMonteCarloProduct product;

    public MonteCarloProductFigure(AbstractMonteCarloProduct product) {
        this.product = product;
    }

    @Override
    public Either<FigureError, RandomVariableInterface> getValue(double evaluationTime, MonteCarloSimulationInterface model) {
        try {
            return Either.right(product.getValue(evaluationTime, model));
        } catch (CalculationException e) {
            return Either.left(new FigureError("AbstractMonteCarloProduct::getValue threw CalculationException", FigureError.Kind.NUMERICAL, e));
        }
    }
}
