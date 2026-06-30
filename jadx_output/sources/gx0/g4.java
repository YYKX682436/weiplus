package gx0;

/* loaded from: classes5.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.m4 f276447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(gx0.m4 m4Var) {
        super(1);
        this.f276447d = m4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.Segment it = (com.tencent.maas.moviecomposing.segments.Segment) obj;
        kotlin.jvm.internal.o.g(it, "it");
        gx0.m4 m4Var = this.f276447d;
        gx0.w wVar = (gx0.w) ((jz5.n) m4Var.f285496s).getValue();
        com.tencent.maas.base.MJID mjid = it.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        wVar.D7(mjid, true, zw0.b.f476551e, (ow0.a0) ((jz5.n) m4Var.f285495r).getValue());
        return jz5.f0.f302826a;
    }
}
