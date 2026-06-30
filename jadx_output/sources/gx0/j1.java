package gx0;

/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f276562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.r1 f276563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.maas.moviecomposing.segments.Segment segment, gx0.r1 r1Var) {
        super(0);
        this.f276562d = segment;
        this.f276563e = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.moviecomposing.segments.Segment segment = this.f276562d;
        if (segment instanceof com.tencent.maas.moviecomposing.segments.WhenWhereSegment) {
            com.tencent.maas.base.MJID mjid = ((com.tencent.maas.moviecomposing.segments.WhenWhereSegment) segment).f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            this.f276563e.p7(mjid, zw0.b.f476551e, mv0.c.f331532d);
        }
        return jz5.f0.f302826a;
    }
}
