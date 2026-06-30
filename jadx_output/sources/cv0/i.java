package cv0;

/* loaded from: classes5.dex */
public final class i extends au0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.maas.moviecomposing.segments.ElementSegment segment) {
        super(segment);
        kotlin.jvm.internal.o.g(segment, "segment");
    }

    @Override // au0.c
    public bu0.b b() {
        ug.m C = ((com.tencent.maas.moviecomposing.segments.ElementSegment) this.f14053a).C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        return av0.a.a(C);
    }

    @Override // au0.c
    public com.tencent.maas.base.MJID c() {
        com.tencent.maas.base.MJID mjid = ((com.tencent.maas.moviecomposing.segments.ElementSegment) this.f14053a).f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        return mjid;
    }

    @Override // au0.c
    public float d() {
        return ((com.tencent.maas.moviecomposing.segments.ElementSegment) this.f14053a).n0();
    }

    @Override // au0.c
    public boolean isEnable() {
        return ((com.tencent.maas.moviecomposing.segments.ElementSegment) this.f14053a).x();
    }
}
