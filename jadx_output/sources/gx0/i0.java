package gx0;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u0 f276516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gx0.u0 u0Var) {
        super(1);
        this.f276516d = u0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.Segment it = (com.tencent.maas.moviecomposing.segments.Segment) obj;
        kotlin.jvm.internal.o.g(it, "it");
        gx0.u0 u0Var = this.f276516d;
        gx0.f4 f4Var = (gx0.f4) ((jz5.n) u0Var.L).getValue();
        com.tencent.maas.base.MJID mjid = it.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        f4Var.D7(mjid, true, zw0.b.f476551e, u0Var.I7());
        return jz5.f0.f302826a;
    }
}
