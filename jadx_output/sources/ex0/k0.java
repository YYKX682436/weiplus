package ex0;

/* loaded from: classes5.dex */
public final class k0 extends ex0.f {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.WhenWhereSegment f257145p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment) {
        super(whenWhereSegment);
        kotlin.jvm.internal.o.g(whenWhereSegment, "whenWhereSegment");
        this.f257145p = whenWhereSegment;
    }

    public final boolean A(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo) {
        kotlin.jvm.internal.o.g(geographicInfo, "geographicInfo");
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment = this.f257145p;
        whenWhereSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = whenWhereSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.B0(whenWhereSegment, geographicInfo, D);
        }
        return bool.booleanValue();
    }

    public final boolean B(long j17) {
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment = this.f257145p;
        whenWhereSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = whenWhereSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.D0(whenWhereSegment, j17, D);
        }
        return bool.booleanValue();
    }
}
