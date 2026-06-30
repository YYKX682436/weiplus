package ex0;

/* loaded from: classes5.dex */
public final class l extends ex0.f {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.MovieTitleSegment f257146p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment) {
        super(movieTitleSegment);
        kotlin.jvm.internal.o.g(movieTitleSegment, "movieTitleSegment");
        this.f257146p = movieTitleSegment;
    }

    public final boolean A(java.lang.String colorStyleID) {
        kotlin.jvm.internal.o.g(colorStyleID, "colorStyleID");
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment = this.f257146p;
        movieTitleSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = movieTitleSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.MovieTitleSegment.D0(movieTitleSegment, colorStyleID, D);
        }
        return bool.booleanValue();
    }
}
