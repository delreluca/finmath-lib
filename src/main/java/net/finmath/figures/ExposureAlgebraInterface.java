package net.finmath.figures;

public interface ExposureAlgebraInterface<R> {
    /**
     * @param r The first exposure.
     * @param s The second exposure.
     * @return The netted exposure.
     */
    R netExposures(R r, R s);

    R experienceExposures(R r, R s, double timeSpan);
}
