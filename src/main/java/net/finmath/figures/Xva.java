package net.finmath.figures;

import io.atlassian.fugue.Either;
import net.finmath.modelling.ModelInterface;
import net.finmath.time.TimeDiscretizationInterface;

import java.util.List;

/**
 * Represents an arbitrary (hence the <em>X</em>) valuation adjustment as figure.
 *
 * @param <R> The type of the resulting figure.
 * @param <M> The type of the model used.
 */
public class Xva<R, M extends ModelInterface> implements FigureInterface<R, M> {
    private List<FigureInterface<R, M>> exposures;
    private TimeDiscretizationInterface aggregationTimes;
    private ExposureAlgebraInterface<R> algebra;

    public Xva(List<FigureInterface<R, M>> exposures, TimeDiscretizationInterface aggregationTimes, ExposureAlgebraInterface<R> algebra) {
        this.exposures = exposures;
        this.aggregationTimes = aggregationTimes;
        this.algebra = algebra;
    }

    @Override
    public Either<FigureError, R> getValue(double evaluationTime, M model) {
        return Either.left(new FigureError("Not implemented yet", FigureError.Kind.UNKNOWN));
    }

//    private static <LL,XX> BinaryOperator<Either<LL,XX>> liftEitherBinaryOperator(BinaryOperator<XX> f) {
//        return (e1,e2) -> e1.flatMap(r1 -> e2.map(r2 -> f.apply(r1,r2)));
//    }
}
