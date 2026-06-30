package zt0;

/* loaded from: classes5.dex */
public abstract class b {
    public static final lw0.d a(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment) {
        kotlin.jvm.internal.o.g(whenWhereSegment, "<this>");
        com.tencent.maas.moviecomposing.Timeline D = whenWhereSegment.D();
        java.lang.String G0 = D != null ? com.tencent.maas.moviecomposing.segments.WhenWhereSegment.G0(whenWhereSegment, D) : "";
        long I0 = whenWhereSegment.I0();
        com.tencent.maas.moviecomposing.segments.GeographicInfo H0 = whenWhereSegment.H0();
        return new lw0.d(G0, I0, H0 != null ? H0.getName() : null);
    }
}
