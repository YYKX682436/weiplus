package gx0;

/* loaded from: classes5.dex */
public final class ib extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(gx0.ac acVar) {
        super(1);
        this.f276535d = acVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.Segment it = (com.tencent.maas.moviecomposing.segments.Segment) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = (com.tencent.maas.moviecomposing.segments.NarrationSegment) it;
        gx0.ac acVar = this.f276535d;
        acVar.getClass();
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        java.lang.String N1 = D != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.N1(narrationSegment, D) : null;
        if (N1 != null) {
            com.tencent.maas.moviecomposing.Timeline D2 = narrationSegment.D();
            java.lang.String z17 = D2 != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.z1(narrationSegment, D2) : null;
            if (z17 != null && ((gx0.w) ((jz5.n) acVar.f222644p).getValue()).g7(fv0.d.f266965q, N1)) {
                com.tencent.maas.moviecomposing.Timeline D3 = narrationSegment.D();
                if (D3 != null) {
                    com.tencent.maas.moviecomposing.segments.NarrationSegment.A1(narrationSegment, N1, z17, D3);
                }
                acVar.h8(narrationSegment, N1, z17);
            }
        }
        return jz5.f0.f302826a;
    }
}
