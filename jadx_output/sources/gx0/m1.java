package gx0;

/* loaded from: classes5.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.r1 f276690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.k0 f276692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f276693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gx0.r1 r1Var, com.tencent.maas.base.MJID mjid, ex0.k0 k0Var, com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        super(1);
        this.f276690d = r1Var;
        this.f276691e = mjid;
        this.f276692f = k0Var;
        this.f276693g = mJTimeRange;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ze2 ze2Var = (r45.ze2) obj;
        gx0.r1 r1Var = this.f276690d;
        if (ze2Var == null) {
            com.tencent.maas.moviecomposing.Timeline o76 = r1Var.s7().o7();
            if (o76 != null) {
                o76.w(this.f276691e);
            }
        } else {
            com.tencent.maas.moviecomposing.segments.GeographicInfo b17 = by0.h.b(ze2Var);
            ex0.k0 k0Var = this.f276692f;
            k0Var.A(b17);
            gx0.kc r76 = r1Var.r7();
            com.tencent.maas.moviecomposing.segments.Segment segment = k0Var.f257167a;
            com.tencent.maas.base.MJID mjid = segment.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            r76.W6(mjid, this.f276693g, new gx0.j1(segment, r1Var));
        }
        return jz5.f0.f302826a;
    }
}
