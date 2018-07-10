package net.finmath.figures;

import io.atlassian.fugue.Either;
import net.finmath.modelling.ModelInterface;

/**
 * Represents a figure that can be calculated.
 *
 * @param <R> The type of the resulting figure.
 * @param <M> The type of the model that can be used to retrieve said figure.
 */
public interface FigureInterface<R, M extends ModelInterface> {
    Either<FigureError, R> getValue(double evaluationTime, M model);
}
