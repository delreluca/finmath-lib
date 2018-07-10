package net.finmath.figures;

import java.util.Optional;

public class FigureError {
    private String explanation;
    private Kind kind;
    private Optional<Exception> exception;

    public FigureError(String explanation, Kind kind) {
        this(explanation, kind, Optional.empty());
    }

    public FigureError(String explanation, Kind kind, Exception exception) {
        this(explanation, kind, Optional.of(exception));
    }

    public FigureError(String explanation, Kind kind, Optional<Exception> exception) {
        this.explanation = explanation;
        this.kind = kind;
        this.exception = exception;
    }

    enum Kind {
        NUMERICAL,
        UNKNOWN
    }
}
