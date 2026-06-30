package uw0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.o f431573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uw0.o oVar) {
        super(1);
        this.f431573d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.Segment it = (com.tencent.maas.moviecomposing.segments.Segment) obj;
        kotlin.jvm.internal.o.g(it, "it");
        uw0.o oVar = this.f431573d;
        gx0.w wVar = (gx0.w) ((jz5.n) oVar.f431585u).getValue();
        com.tencent.maas.base.MJID mjid = it.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        wVar.D7(mjid, true, zw0.b.f476551e, oVar.F7());
        return jz5.f0.f302826a;
    }
}
